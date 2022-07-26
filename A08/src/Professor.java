public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
    }
}
