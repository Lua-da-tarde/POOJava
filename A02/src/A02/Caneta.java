package A02;

public class Caneta {
    public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.println("\nModelo: " + this.modelo);
		System.out.println("Carga: " + this.carga);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Está tampada? " + this.tampada);
		System.out.println("Ponta: " + this.ponta);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("\nERRO! Não é possível rabiscar.");
		} else {
			System.out.println("\nEstou rabiscando.");
		}
	}

	protected void tampar() {
		this.tampada = true;
	}

	protected void destampar() {
		this.tampada = false;
	}
}
