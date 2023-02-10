public class Canguru extends Mamifero{
    public Canguru(double peso, int idade, int membros) {
        super(peso, idade, membros);
    }
    
    public void usarBolsa(){
        System.out.println("\no canguru guardou algo na bolsa..");
    }

    @Override
    public void locomover(){
        System.out.println("\n pula pula pula pula");
    }
}
