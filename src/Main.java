import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		Muistio muistio = new Muistio();
		// Ladataan tiedostosta numerot, jos sellainen löytyy. Jos tiedostoa ei
		// löydy, niin tiedostonkäsittelijä luo
		// uuden tyhjän muistion

		muistio = TiedostonKasittelija.lataaTallennettu();

		// alkuteksti joka kertoo käytettävissä olevat komennot
		System.out.println("P U H E L I N M U I S T I O");
		System.out.println("---------------------------");
		System.out.println("1 - lisää uusi numero\n2 - hae numeroa\n3 - näytä kaikki\n4 - lopeta");
		// silmukka jotta voi käyttää useampaa komentoa kerralla

		while (true) {

			System.out.println("Anna komento: ");

			int valinta = lukija.nextInt();
			// Luetaan rivinvaihto pois

			lukija.nextLine();
			
			switch (valinta) {
			// 1. vaihtoehto eli lisää numero, antaa nimen ja numeron jotka
			// lisätään puhelinmuistioon
			case 1: {
				System.out.println("Anna nimi: ");
				String nimi = lukija.nextLine();
				System.out.println("Anna numero: ");
				String numero = lukija.nextLine();
				muistio.lisaa(nimi, numero);
				break;
			}
			// 2. vaihtoehto eli numeron haku, hakee annetun nimen perusteella
			// löytyykö numeroa puhelinmuistiosta
			case 2: {
				System.out.println("Nimi: ");
				String haettava = lukija.nextLine();
				String numero = muistio.haeNumero(haettava);
				System.out.println(numero);
				break;
			}
			// 3. vaihtoehto tulostaa kaikki puhelinmuistiossa olevat nimet ja
			// numerot
			case 3: {
				muistio.tulostakaikki();
				break;
			}
			// 4. vaihtoehto lopettaa puhelinmuistion toiminna.
			case 4: {
				System.out.println("Puhelinmuistio sulkeutuu..");
				// Tallennetaan muistio ennen lopettamista
				TiedostonKasittelija.tallenna(muistio);
				System.exit(0);
				break;
			}
			default:
				break;

			}
		}
	}

}

