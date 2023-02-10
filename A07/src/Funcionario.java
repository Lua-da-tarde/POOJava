public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }
    
    public String getSetor(){
        return this.setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public boolean getTrabalhando(){
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){
        this.setTrabalhando(false);
    }
}
