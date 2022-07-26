public class Aluno extends Pessoa{
    private float matricula;
    private String curso;

    public Aluno(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }

    public float getMatricula(){
        return this.matricula;
    }

    public void setMatricula(float matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void cancelarMatr(){
        this.setMatricula(0);
        this.setCurso("cancelado");
    }
}
