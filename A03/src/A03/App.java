package A03;
public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("NIC", "Vermelho", 0.4f);
		c1.status();

		//System.out.println("Tenho uma caneta " + c1.modelo);
		System.out.println("\nTenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
