package klase3;

import java.util.List;

public class Putovanje {

	private String destinacija;
	private int cenaAranzmana;
	private List<Putnici> putnici;
	
	public Putovanje(String destinacija, int cenaAranzmana, List<Putnici> putnici) {
		super();
		this.destinacija = destinacija;
		this.cenaAranzmana = cenaAranzmana;
		this.putnici = putnici;
	}

	public String getDestinacija() {
		return destinacija;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public int getCenaAranzmana() {
		return cenaAranzmana;
	}

	public void setCenaAranzmana(int cenaAranzmana) {
		this.cenaAranzmana = cenaAranzmana;
	}

	public List<Putnici> getPutnici() {
		return putnici;
	}

	public void setPutnici(List<Putnici> putnici) {
		this.putnici = putnici;
	}
	
	
}
