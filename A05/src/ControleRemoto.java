public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return this.volume;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    @Override
    public void ligar(){
        if(ligado=false){
            this.setLigado(true);
            this.setTocando(true);
        }
    }

    @Override
    public void desligar(){
        if(ligado=true){
            this.setLigado(false);
            this.setTocando(true);
        }
    }

    @Override
    public void abrirMenu(){
        int i = 0;
        System.out.println("\n\n--- MENU ---");
        System.out.println("Volume: " + getVolume());
        System.out.println("Ligado: " + getLigado());
        System.out.println("Tocando: " + getTocando());
        for( i = 0; i <= getVolume(); i+=10){
            
        }
        System.out.println("------------\n");
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume(){
        if(ligado=true){
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume(){
        if(ligado=true){
            this.setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo(){
        if(this.getLigado() &&this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(5);
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
