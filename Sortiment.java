import java.time.LocalDate;
import java.util.ArrayList;

public class Sortiment {
	
	
	public static void main(String[] args) {

		
		  Kaese k�seSorte_1 =  new Kaese("BergK�se",LocalDate.of(2023, 05, 1), 20);
		  Kaese k�seSorte_2 = new Kaese("LedemaK�se",LocalDate.of(2023, 05, 10), 10);
		  Kaese k�seSorte_3 = new Kaese("K�se aus Holland",LocalDate.of(2023, 03, 1),5); 
		  Kaese k�seSorte_4 = new Kaese("BergK�se aus Frankreich",LocalDate.of(2023, 05, 11), 66); Kaese
		  k�seSorte_5 = new Kaese("K�se Mischung",LocalDate.of(2023, 02, 1), 20);
		 
		
		ArrayList<Kaese> sortimentKaese = new ArrayList<Kaese>();
		sortimentKaese.add(k�seSorte_1);
		
		  sortimentKaese.add(k�seSorte_2); 
		  sortimentKaese.add(k�seSorte_3);
		  sortimentKaese.add(k�seSorte_4); 
		  sortimentKaese.add(k�seSorte_5);
		 
		
		System.out.println("Der K�se Sortiment ist: ");
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
