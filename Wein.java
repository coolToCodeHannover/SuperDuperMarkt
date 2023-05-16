import java.text.NumberFormat;
import java.time.LocalDate;

public class Wein implements Produkte {

	public String bezeichnung;
	public long qualitaet;
	LocalDate verfallsdatum;
	LocalDate einraeumTag;
	public double grundpreis;
	public double tagespreis;
	public double qualitaetInTage;

	public Wein(String bezeichnung, LocalDate einraeumTag, double grundpreis) {

		this.bezeichnung = bezeichnung;
		this.einraeumTag = einraeumTag;
		this.grundpreis = grundpreis;

	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public long getQualitaet() {
		return qualitaet;
	}

	public void setQualitaet(long qualitaet) {
		this.qualitaet = qualitaet;
	}

	public LocalDate getVerfallsdatum() {
		return verfallsdatum;
	}

	public void setVerfallsdatum(LocalDate verfallsdatum) {
		this.verfallsdatum = verfallsdatum;
	}

	public LocalDate getEinraeumTag() {
		return einraeumTag;
	}

	public void setEinraeumTag(LocalDate einraeumTag) {
		this.einraeumTag = einraeumTag;
	}

	public double getGrundpreis() {
		return grundpreis;
	}

	public void setGrundpreis(long grundpreis) {
		this.grundpreis = grundpreis;
	}

	public double getTagespreis() {
		return tagespreis;
	}

	public void setTagespreis(long tagespreis) {
		this.tagespreis = tagespreis;
	}

	public double getQualitaetInTage() {
		return qualitaetInTage;
	}

	public void setQualitaetInTage(long qualitaetInTage) {
		this.qualitaetInTage = qualitaetInTage;
	}

	/**************************************************************/

	// Aktueller Tag für die Ausgabe
	LocalDate heuteDatum = LocalDate.now();

	public long qualitaetTage() {

		// Stichtag ist 10 Tage nach d Einräumen ins Regal
		LocalDate stichtag;

		for (int j = 10; j <= 50 * 10; j += 10) {
			stichtag = einraeumTag.plusDays(j);
			qualitaet++;
		}

		return qualitaet;
	}

	public String removeFromShelfOrNot() {
		qualitaetInTage = qualitaetTage();
		if (qualitaetInTage > 0) {
			return "ja";
		}
		return "nein";
	}

	public double tagesPreis() {
		return grundpreis;

	}


	@Override
	public String toString() {
		
		NumberFormat n = NumberFormat.getInstance();
		n.setMaximumFractionDigits(1);
		String preis = n.format(tagesPreis());
		String ausgabe = "Regalinhalt: " + '\n' + "";
		
		
		for(int i = 0; i < 5 ; i++) {
			ausgabe +=  "Bezeichnung:" + bezeichnung + " ";
			ausgabe += "  ** Datum: " + heuteDatum.plusDays(i); 
			ausgabe += " ** Tagespreis  " + preis +" €. ";
			ausgabe += " ** Qualität: "+qualitaetTage();
			ausgabe += " ** Aussortieren? " +removeFromShelfOrNot() + '\n';
					
		}
		
		return ausgabe;
	
	}}

