public class App {
    public static void main(String[] args) throws Exception {
        //Mamifero m = new Mamifero(41.5, 8, 4);
        //Reptil r = new Reptil(2.3, 4, 4);
        //Peixe p = new Peixe(4, 2, 0);
        //Ave a = new Ave(6, 23, 2);
        Cachorro c = new Cachorro(21.7, 5, 4);
        Canguru ca = new Canguru(45.6, 17, 4);
        Tartaruga t = new Tartaruga(0.5, 29, 4);


        //r.emitirSom();
        
        //m.locomover();
        //m.alimentar();
        //m.emitirSom();

        //p.locomover();
        //p.alimentar();
        //p.emitirSom();

        //a.locomover();
        //a.alimentar();
        //a.emitirSom();

        ca.locomover();
        ca.alimentar();
        ca.emitirSom();
        ca.usarBolsa();

        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.abanarRabo();
        c.enterrarOsso();

        t.locomover();
        t.alimentar();
        t.emitirSom();
    }
}
