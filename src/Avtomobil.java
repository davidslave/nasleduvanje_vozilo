public class Avtomobil extends Vozilo {
	private int brojVrati;

	public Avtomobil(int brzina, int kapacitetGorivo, int brojVrati) {
		super(brzina, kapacitetGorivo);
		this.brojVrati = brojVrati;
	}

	public int getBrojVrati() {
		return brojVrati;
	}

	public void setBrojVrati(int brojVrati) {
		this.brojVrati = brojVrati;
	}

	public void zapali() {
		System.out.println("Автомобилот запали.");
	}
}
