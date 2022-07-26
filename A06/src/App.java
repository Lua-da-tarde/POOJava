public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("WhitePill", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("JessicaAcabada", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Catboy", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("CanguruPerneta", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("StefanyBombada", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("GigaChad", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        Luta ufc1 = new Luta();
        ufc1.marcarLuta(l[1], l[0]);
        ufc1.luta();
    }
}
