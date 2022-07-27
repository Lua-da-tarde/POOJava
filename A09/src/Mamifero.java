public class Mamifero extends Animal{
    private String corPelo;
    
    public Mamifero(double peso, int idade, int membros) {
        super(peso, idade, membros);
    }
    
    public String getCorPelo(){
        return this.corPelo;
    }

    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }

    @Override
    public void locomover(){
        System.out.println("\ncorrendo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("\nmamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("\nsom de mamífero");
    }
}
