public class Aluno extends Pessoa{
    private String login;
    private float totAssistido;

    public Aluno(String nome, int idade, String genero, String login) {
        super(nome, idade, genero);
        this.login = login;
        this.totAssistido = 1;
    }
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public float getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(float totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    @Override
    public String toString() {
        return "Aluno [login=" + login + ", totAssistido=" + totAssistido + "]";
    }

    
}
