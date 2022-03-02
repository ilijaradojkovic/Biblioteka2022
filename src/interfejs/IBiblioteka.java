package interfejs;

import java.util.List;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface IBiblioteka {

	public void dodajKnjigu(Knjiga knjiga);
	public void izbrisiKnjigu(Knjiga knjiga);
	public List<Knjiga> vratiKnjige();
	public List<Knjiga> pronadjiKnjigu(Autor autor,long isbn,String naslov,String izdavac);
}
