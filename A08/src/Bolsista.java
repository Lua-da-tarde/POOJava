public final class Bolsista extends Aluno{
    private double bolsa;
    
    public Bolsista(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }

    public double getBolsa(){
        return this.bolsa;
    }

    public void setBolsa(double bolsa){
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando com bolsa S2.");
    }
}
