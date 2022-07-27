public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("\nAu! Au! Au! Au!");
    }

    public void abanarRabo(){
        System.out.println("\n[abana o rabo de forma fofa]");
    }

    public void reagir(String fala){
        System.out.println("\nVOCÊ: " + fala);
        System.out.println("CACHORRO: ");
        if(fala.contains("comida")){
            abanarRabo();
            emitirSom();
        }else{
            rosnar();
        }
        System.out.println("-----------------");
    }

    public void reagir(int hr){
        System.out.println("\n" + hr + " horas.");
        System.out.println("CACHORRO: ");
        if(hr<12){
            abanarRabo();
        }else if(hr<12 && hr<18){
            abanarRabo();
            emitirSom();
        }else{
            ignorar();
        }
        System.out.println("-----------------");
    }

    public void reagir(boolean dono){
        System.out.println("\nVocê é o dono? " + dono);
        System.out.println("CACHORRO: ");
        if(dono=false){
            rosnar();
            emitirSom();
        }else{
            abanarRabo();
        }
        System.out.println("-----------------");
    }

    public void reagir(int id, double peso){
        System.out.println("\nO doguinho tem " + id + " anos e pesa " + peso + " quilos.");
        System.out.println("CACHORRO: ");
        if(id<7 && peso<10){
            abanarRabo();
        }else if(id<7 && peso>=10){
            emitirSom();
        }else if(id>=7 && peso<10){
            rosnar();
        }else{
            ignorar();
        }
        System.out.println("-----------------");
    }
}
