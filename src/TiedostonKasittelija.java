import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TiedostonKasittelija {

	public static void tallenna(Muistio tallennetutNumerot) {

		// Esitell‰‰n tiedosto, johon kirjoitetaan sek‰ kirjoittaja-olio

		FileOutputStream tiedosto;
		try {
			tiedosto = new FileOutputStream("PuhelinMuistio.ser");

			ObjectOutputStream olionKirjoittaja = new ObjectOutputStream(tiedosto);

			olionKirjoittaja.writeObject(tallennetutNumerot);
			// Lopputoimet, suljetaan tiedosto ja tyhjennet‰‰n kirjoittaja-olio

			olionKirjoittaja.flush();
			tiedosto.close();

		} catch (Exception e) {
			System.out.println("Tiedoston tallennuksessa tapahtui virhe!");
		}

	}

	public static Muistio lataaTallennettu() {
		FileInputStream tiedosto;
		Muistio tallennetutNumerot = null;

		try {
			tiedosto = new FileInputStream("PuhelinMuistio.ser");

			ObjectInputStream tallesta = new ObjectInputStream(tiedosto);
			tallennetutNumerot = (Muistio) tallesta.readObject();
			tiedosto.close();
		} catch (FileNotFoundException e) {
			System.out.println("Tiedostoa ei ollut olemassa, luodaan tyhj‰ muistio!");
			tallennetutNumerot = new Muistio();

		} catch (Exception e) {
			System.out.println("Tiedoston lataamisessa tapahtui virhe!");
		}
		return tallennetutNumerot;
	}
}

