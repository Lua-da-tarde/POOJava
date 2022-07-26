import java.util.Random;

public class Luta {
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //CONSTRUCT
    /*public Luta(Lutador desafiado, Lutador desafiante){
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }*/

    //GET E SET
    public int getRounds(){
        return this.rounds;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    //MÉTODOS
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria()==l2.getCategoria() && l1 != l2){
                this.setAprovada(true);
                this.setDesafiado(l1);
                this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void luta(){
        if(this.getAprovada()==true){
            System.out.println("\n##### DESAFIADO #####");
            desafiado.apresentar();
            System.out.println("\n##### DESAFIANTE #####");
            desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("\n========== RESULTADO ===========");
            switch(vencedor){
                case 1: //EMPATE
                    System.out.println("Houve um EMPATE!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 2: //DESAFIADO GANHA
                    System.out.println(this.desafiado.getNome() + " GANHOU!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 3: //DESAFIANTE GANHA
                    System.out.println(this.desafiante.getNome() + " GANHOU!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
            System.out.println("======================================");
        }else{
            System.out.println("\nLuta não pode acontecer!");
        }
    }
}
