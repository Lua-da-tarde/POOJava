public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 14 de Python");
        v[2] = new Video("Aula 6 de Javascript");

        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Taylor", 18, "Outro", "taylor13");
        a[1] = new Aluno("Stevie", 26, "Feminino", "flames");

        Visualizacao vw[] = new Visualizacao[5];
        vw[0] = new Visualizacao(a[0], v[1]);
        vw[1] = new Visualizacao(a[1], v[2]);

        System.out.println(vw[0].toString());
        System.out.println(vw[1].toString());
        vw[1].avaliar(70);
        v[2].like();
        System.out.println(vw[1].toString());
    }
}
