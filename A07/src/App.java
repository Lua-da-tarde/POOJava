public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Claudia", 36, "Feminino");
        Aluno p2 = new Aluno("Agatha", 24, "Feminino");
        Professor p3 = new Professor("Alberto", 58, "Masculino");
        Funcionario p4 = new Funcionario("Taylor", 28, "Outro");

        p2.setCurso("Informática");
        p3.setSalario(1220);
        p4.setSetor("Secretaria");

        p1.setIdade(35);
        p3.receberAumento(550.20);
        p4.mudarTrabalho();
        p2.cancelarMatr();

    }
}
