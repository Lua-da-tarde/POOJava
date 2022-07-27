public class Mamifero extends Animal{
    protected String corPelo;

    public String getCorPelo(){
        return this.corPelo;
    }

    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom(){
        System.out.println("\nsom de mamífero");
    }

    @Override
    public void ignorar() {
        System.out.println("[ignora]");
    }
}
