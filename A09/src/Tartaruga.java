public class Tartaruga extends Reptil{
    public Tartaruga(double peso, int idade, int membros) {
        super(peso, idade, membros);
    }
    
    @Override
    public void locomover(){
        System.out.println("\n andando bem lentamente...");
    }
}
