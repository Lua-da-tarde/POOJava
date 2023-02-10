public final class Tecnico extends Aluno{
    private float registroProfissional;
    
    public Tecnico(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }

    public float getRegistroProfissional(){
        return this.registroProfissional;
    }

    public void setRegistroProfissional(float registroProfissional){
        this.registroProfissional = registroProfissional;
    }

    public void praticar(){
        System.out.println(this.getNome() + ", está praticando..");
    }
}
