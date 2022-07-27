public class Ave extends Animal {
    private String corPena;

    public Ave(double peso, int idade, int membros){
        super(peso, idade, membros);
    }

    public String getCorPena(){
        return this.corPena;
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }

    @Override
    public void locomover(){
        System.out.println("\nvoando");
    }

    @Override
    public void alimentar(){
        System.out.println("\ncomendo frutas");
    }

    @Override
    public void emitirSom(){
        System.out.println("\nsom de ave");
    }

    public void fazerNinho(){
        System.out.println("\nvocê fez um ninho bem aconchegante.");
    }
}
