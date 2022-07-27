public class Peixe extends Animal{
    private String corEscama;

    public Peixe(double peso, int idade, int membros){
        super(peso, idade, membros);
    }

    public String getCorEscama(){
        return this.corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    @Override
    public void locomover(){
        System.out.println("\ncontinue a nadar, continue a nadar..");
    }

    @Override
    public void alimentar(){
        System.out.println("\ncomendo substâncias(n sei quais)");
    }

    @Override
    public void emitirSom(){
        System.out.println("\npeixe não faz som");
    }

    public void soltarBolha(){
        System.out.println("\nolha que fofinho ele fazendo bolhinha ná água, ownnt");
    }
}
