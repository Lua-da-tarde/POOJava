public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String genero;
    protected float exp;
    
    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.exp = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public float getExp(){
        return this.exp;
    }

    public void setExp(float exp){
        this.exp = exp;
    }

    protected void ganharExp(float a){
        this.setExp(this.getExp() + a);
    }
}
