public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco cb1 = new ContaBanco("Ronaldinho");
        ContaBanco cb2 = new ContaBanco("Claudia");
        ContaBanco cb3 = new ContaBanco("Jubileu");

        cb1.abrirConta(000001, "poupanca");
        cb2.abrirConta(000002, "corrente");

        cb1.depositar(100);

        cb2.depositar(260);
        cb2.sacar(40);

        cb1.fecharConta();
        cb1.estatus();

    }
}
