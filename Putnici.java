package klase3;

public class Putnici {

	private String ime, prezime;
	private int brojPasosa;
	public Putnici(String ime, String prezime, int brojPasosa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojPasosa = brojPasosa;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getBrojPasosa() {
		return brojPasosa;
	}
	public void setBrojPasosa(int brojPasosa) {
		this.brojPasosa = brojPasosa;
	}
	
	
}
