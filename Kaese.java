import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kaese implements Produkte{
	
	
	public String bezeichnung;
	LocalDate verfallsdatum;
	LocalDate einraeumTag;
	public double grundpreis;
	public double tagespreis;
	public double qualitaetInTage;
	

	public Kaese(String bezeichnung,LocalDate einraeumTag, double grundpreis) {
		
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
	
	LocalDate heuteDatum = LocalDate.now();
	
	public long qualitaetTage() {
				
	    long qualitaet = ChronoUnit.DAYS.between(einraeumTag, heuteDatum);
	    
	    return qualitaet;	
	}
	
		
	public String removeFromShelfOrNot() {

		qualitaetInTage = qualitaetTage();
		if(qualitaetInTage>30) {
			return "ja";
		}
		return "nein";
	}
	
	public double tagesPreis() {
		qualitaetInTage = qualitaetTage();
		tagespreis = (grundpreis + 0.1)* qualitaetInTage;
		
		return tagespreis;
		
	}


	@Override
	public String toString() {
		
		NumberFormat n = NumberFormat.getInstance();
		n.setMaximumFractionDigits(1);
		String preis = n.format(tagesPreis());
		long qualitaetVerlust = qualitaetTage();
		String ausgabe = "Regalinhalt: " + '\n' + "";
		
		
		for(int i = 0; i < 5 ; i++) {
			ausgabe +=  "Bezeichnung:" + bezeichnung + " ";
			ausgabe += "  ** Datum: " + heuteDatum.plusDays(i); 
			ausgabe += " ** Tagespreis  " + preis +" €. ";
			ausgabe += " ** Qualität: "+qualitaetVerlust--;
			ausgabe += " ** Aussortieren? " +removeFromShelfOrNot() + '\n';
					
		}
		
		return ausgabe;
	
	}


	



}
