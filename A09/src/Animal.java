public abstract class Animal {
    private double peso;
    private int idade;
    private int membros;

    public Animal(double peso, int idade, int membros){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double p){
        this.peso = p;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int i){
        this.idade = i;
    }

    public int getMembros(){
        return this.membros;
    }

    public void setMembros(int m){
        this.membros = m;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
