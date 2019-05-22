import java.io.Serializable;

public class Henkilo implements Serializable {

	private String nimi;
	private String numero;

	// annetaan nimi ja numero Henkilolle
	public Henkilo(String nimi, String numero) {
		this.nimi = nimi;
		this.numero = numero;
	}

	// palauttaa nimen ja numeron
	public String toString() {
		return this.nimi + " puh: " + this.numero;
	}

	// palauttaa nimen
	public String getNimi() {
		return this.nimi;
	}

	// palauttaa numeron
	public String getNumero() {
		return this.numero;
	}

}

