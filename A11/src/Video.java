public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private float views;
    private float curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public float getViews() {
        return views;
    }

    public void setViews(float views) {
        this.views = views;
    }

    public float getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(float curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play(){
        this.setReproduzindo(true);
    }

    @Override
    public void pause(){
        this.setReproduzindo(false);
    }

    @Override
    public void like(){
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video [avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo
                + ", titulo=" + titulo + ", views=" + views + "]";
    }

    
}
