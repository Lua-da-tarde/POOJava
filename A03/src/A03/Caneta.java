package A03;

public class Caneta {
    public String modelo;
	private String cor;
	private boolean tampada;
	private float ponta;

	public Caneta(String modelo, String cor, float ponta) { //Método Construtor (tem o mesmo nome da classe)
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampar();
	}	

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

    public boolean getTampada() {
		return this.tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void status() {
		System.out.println("\nSOBRE A CANETA");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: " + this.getTampada());
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
}
