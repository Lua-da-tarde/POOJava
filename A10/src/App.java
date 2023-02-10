public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c1 = new Cachorro();

        c1.reagir("toma comida lindinho");
        c1.reagir(true);
        c1.reagir(20);
        c1.reagir(8, 6);
    }
}
