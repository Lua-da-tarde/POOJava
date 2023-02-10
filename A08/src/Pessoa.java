public abstract class Pessoa {
    private String nome;
    private int idade;
    private String genero;

    public Pessoa(String nome, int idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
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

    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString(){
        return "Pessoa" + "nome: " + this.getNome() + ", idade: " + this.getIdade() + ", genero: " + this.getGenero();
    }
}
