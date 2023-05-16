import java.time.LocalDate;
import java.util.ArrayList;

public class Sortiment {
	
	
	public static void main(String[] args) {

		
		  Kaese käseSorte_1 =  new Kaese("BergKäse",LocalDate.of(2023, 05, 1), 20);
		  Kaese käseSorte_2 = new Kaese("LedemaKäse",LocalDate.of(2023, 05, 10), 10);
		  Kaese käseSorte_3 = new Kaese("Käse aus Holland",LocalDate.of(2023, 03, 1),5); 
		  Kaese käseSorte_4 = new Kaese("BergKäse aus Frankreich",LocalDate.of(2023, 05, 11), 66); Kaese
		  käseSorte_5 = new Kaese("Käse Mischung",LocalDate.of(2023, 02, 1), 20);
		 
		
		ArrayList<Kaese> sortimentKaese = new ArrayList<Kaese>();
		sortimentKaese.add(käseSorte_1);
		
		  sortimentKaese.add(käseSorte_2); 
		  sortimentKaese.add(käseSorte_3);
		  sortimentKaese.add(käseSorte_4); 
		  sortimentKaese.add(käseSorte_5);
		 
		
		System.out.println("Der Käse Sortiment ist: ");
		System.out.println(sortimentKaese.toString());
		System.out.println('\n'+"****************************************************"+'\n');
		
		Wein wein_1 =  new Wein("Sekt",LocalDate.of(2023, 01, 1), 20);
		Wein wein_2  = new Wein("Wein",LocalDate.of(2027, 04, 1), 10);
		Wein wein_3  = new Wein("Wein aus Holland",LocalDate.of(2022, 03, 1), 5);
		Wein wein_4  = new Wein("Wein aus Frankreich",LocalDate.of(2023, 05, 11), 66);
		Wein wein_5  = new Wein("Frucht Secco",LocalDate.of(2023, 02, 11), 20);
		
		ArrayList<Wein> sortimentWein = new ArrayList<Wein>();
		sortimentWein.add(wein_1);
		sortimentWein.add(wein_2);
		sortimentWein.add(wein_3);
		sortimentWein.add(wein_4);
		sortimentWein.add(wein_5);

		System.out.println("Der Wein Sortiment ist: ");
		System.out.println(sortimentWein.toString());

}}
