public class App {
    public static void main(String[] args) throws Exception {
        Aluno p2 = new Aluno("Agatha", 24, "Feminino");
        Bolsista b1 = new Bolsista("Harley", 19, "Outro");
        Professor p3 = new Professor("Alberto", 58, "Masculino");
        Tecnico t1 = new Tecnico("Stevie", 27, "Feminino");

        p2.setCurso("Informática");
        p3.setSalario(1220);

        p3.receberAumento(550.20);
        p2.pagarMensalidade();
        b1.pagarMensalidade();
        t1.praticar();
    }
}
 