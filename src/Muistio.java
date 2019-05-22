import java.io.Serializable;
import java.util.ArrayList;

public class Muistio implements Serializable {

	// Luo listan nimelt� Henkilo
	private ArrayList<Henkilo> henkilot = new ArrayList<>();

	// lis�� uuden henkilon nimen ja numeron listaan
	public void lisaa(String nimi, String numero) {
		henkilot.add(new Henkilo(nimi, numero));

	}

	// k�y l�pi kaikki henkil�t ja tulostaa ne
	public void tulostakaikki() {

for (Henkilo Henkilo : henkilot) {
			System.out.println(Henkilo);
		}
	}

	// k�y l�pi listassa olevat henkil�t ja hakee halutun numeron nimen
	// perusteella
	public String haeNumero(String nimi) {
		for (Henkilo Henkilo : henkilot) {
			if (Henkilo.getNimi().equals(nimi)) {
				return Henkilo.getNumero();
			}
		}
		// jos numeroa ei l�ydy nimen perusteella listalta niin..
		return "Numeroa ei l�ydy.";
	}

}

