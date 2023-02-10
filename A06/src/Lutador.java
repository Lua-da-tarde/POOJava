public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //CONSTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //GET E SET
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }

    private void setCategoria(){
        if(peso < 52.2){
            this.categoria = "Inválido";
        }else if(peso <= 70.3){
            this.categoria = "Leve";
        }else if(peso <= 83.9){
            this.categoria = "Médio";
        }else if(peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return this.empates;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    //MÉTODOS
    public void apresentar(){
        System.out.println("\nChegando no ringue, é o lutador " + this.getNome() + ", será que ele vai vencer hoje?");
    }

    public void status(){
        System.out.println("\n\n--- STATUS ---");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("--------------");
    }

    public void ganharLuta(){
        //System.out.println("\n" + this.getNome() + ", ganhou a luta!");
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        //System.out.println("\n" + this.getNome() + ", perdeu a luta!");
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        //System.out.println("\n" + this.getNome() + ", empatou a luta!");
        this.setEmpates(this.getEmpates() + 1);
    }
}
