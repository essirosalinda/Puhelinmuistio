import java.io.Serializable;
import java.util.ArrayList;

public class Muistio implements Serializable {

	// Luo listan nimeltä Henkilo
	private ArrayList<Henkilo> henkilot = new ArrayList<>();

	// lisää uuden henkilon nimen ja numeron listaan
	public void lisaa(String nimi, String numero) {
		henkilot.add(new Henkilo(nimi, numero));

	}

	// käy läpi kaikki henkilöt ja tulostaa ne
	public void tulostakaikki() {

for (Henkilo Henkilo : henkilot) {
			System.out.println(Henkilo);
		}
	}

	// käy läpi listassa olevat henkilöt ja hakee halutun numeron nimen
	// perusteella
	public String haeNumero(String nimi) {
		for (Henkilo Henkilo : henkilot) {
			if (Henkilo.getNimi().equals(nimi)) {
				return Henkilo.getNumero();
			}
		}
		// jos numeroa ei löydy nimen perusteella listalta niin..
		return "Numeroa ei löydy.";
	}

}

