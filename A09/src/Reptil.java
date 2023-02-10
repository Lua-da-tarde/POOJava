public class Reptil extends Animal{
    private String corEscama;

    public Reptil(double peso, int idade, int membros){
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
        System.out.println("\nrastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("\ncomendo vegetais");
    }

    @Override
    public void emitirSom(){
        System.out.println("\nsom de réptil(?)");
    }
}
