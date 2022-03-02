package biblioteka;

import java.util.List;

public class Knjiga {

	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autori == null) ? 0 : autori.hashCode());
		result = prime * result + (int) (isbn ^ (isbn >>> 32));
		result = prime * result + izdanje;
		result = prime * result + ((izdavac == null) ? 0 : izdavac.hashCode());
		result = prime * result + ((naslov == null) ? 0 : naslov.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (autori == null) {
			if (other.autori != null)
				return false;
		} else if (!autori.equals(other.autori))
			return false;
		if (isbn != other.isbn)
			return false;
	
		
		return true;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	public List<Autor> getAutori() {
		return autori;
	}
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	private String naslov;
	private long isbn;
	private List<Autor> autori;
	private String izdavac;
	private int izdanje;
}
