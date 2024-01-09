public class TestVozila {
	public static void main(String[] args) {
		Avtomobil avtomobil = new Avtomobil(120, 60, 4);

		System.out.println("Брзина: " + avtomobil.getBrzina());
		System.out.println("Капацитет на гориво: " + avtomobil.getKapacitetGorivo());
		System.out.println("Број на врати: " + avtomobil.getBrojVrati());

		avtomobil.zapali();
	}
}