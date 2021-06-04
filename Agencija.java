package klase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agencija {

	public static void main(String[] args) {

		/*
		 * Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika. Putnici imaju ime, prezime i broj pasosa.
U glavnom programu se igrati i testirati napisane klase.
Obavezni deo: napraviti bar 3 razlicita putovanja. Po zelji staviti putovanja u listu koja se zove ponuda. 
Jednom putovanju bar promeniti cenu aranzmana. Izbaciti jedno putovanje iz ponude.
Sa putovanja izbaciti jednog od putnika.
Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka
		 */
		
		Putnici p1 = new Putnici("Petar", "Peric", 1111111);
		Putnici p2 = new Putnici("Milos", "Milosevic", 1111112);
		Putnici p3 = new Putnici("Stefan", "Stefanovic", 1111113);
		Putnici p4 = new Putnici("Ana", "Antic", 1111114);
		
		List<Putnici> listaPutnikaZanzibar = new ArrayList<Putnici>();
		List<Putnici> listaPutnikaMaldivi = new ArrayList<Putnici>();
		List<Putnici> listaPutnikaKuba = new ArrayList<Putnici>();
		
		listaPutnikaZanzibar.add(p1);
		listaPutnikaZanzibar.add(p4);
		
		listaPutnikaMaldivi.add(p2);
		listaPutnikaMaldivi.add(p3);
		
		listaPutnikaKuba.add(p4);
		listaPutnikaKuba.add(p3);
		listaPutnikaKuba.add(p2);
		listaPutnikaKuba.add(p1);
		listaPutnikaKuba.add(null);
		
		List<Putovanje> ponuda = new ArrayList<Putovanje>();
		
		Putovanje zzb = new Putovanje("Zanzibar", 1500, listaPutnikaZanzibar);
		Putovanje mdv = new Putovanje("Maldivi", 1800, listaPutnikaMaldivi);
		Putovanje kuba = new Putovanje("Kuba", 1700, listaPutnikaKuba);
		Putovanje pariz = new Putovanje("Pariz", 700, listaPutnikaKuba);
		
		ponuda.add(kuba);
		ponuda.add(mdv);
		ponuda.add(zzb);
		ponuda.add(pariz);
		
		System.out.println("Stara cena " + ponuda.get(1).getCenaAranzmana());
		ponuda.get(1).setCenaAranzmana(1300);
		System.out.println("Akcijska cena " + ponuda.get(1).getCenaAranzmana());
		
		System.out.println("Broj putnika " + ponuda.get(3).getPutnici().size());
		ponuda.get(3).getPutnici().remove(1);
		System.out.println("Smanjen broj putnika " + ponuda.get(3).getPutnici().size());

		System.out.println("Sve destinacije " + ponuda.size());
		ponuda.remove(2);
		System.out.println("Bez Zanzibara " + ponuda.size());
		
		pretragaAranzmana(ponuda);
	}

	public static void pretragaAranzmana(List<Putovanje> ponuda) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Unesite zeljenu destinaciju, unesite izlaz za izlaz iz programa:" );
		String izbor = sc.next().toUpperCase();
		int brojPonuda = ponuda.size();
		boolean nadjenaPonuda = false;
		
		do {
			for(int i = 0; i < brojPonuda; i++) {
				while(izbor.equalsIgnoreCase("izlaz")) {
					nadjenaPonuda = true;
					break;
				}
				if(ponuda.get(i).getDestinacija().equalsIgnoreCase(izbor)) {
					System.out.println(sb.toString() + ":: cena aranzmana :: " +
						 ponuda.get(i).getCenaAranzmana() + " eura");
					nadjenaPonuda = true;
					break;
				}
			}if(!nadjenaPonuda) {
				System.out.println("Nemamo tu destinaciju u ponudi");
				break;
			}
		}while(!nadjenaPonuda);
		
		/*
		 * switch(izbor){ case "ZANZIBAR": sb.append(ponuda.get(2).getDestinacija());
		 * System.out.println(sb.toString() + ":: cena aranzmana :: " +
		 * ponuda.get(2).getCenaAranzmana() + " eura"); break; case "MALDIVI":
		 * sb.append(ponuda.get(1).getDestinacija()); System.out.println(sb.toString() +
		 * ":: cena aranzmana :: " + ponuda.get(1).getCenaAranzmana() + " eura"); break;
		 * case "KUBA": sb.append(ponuda.get(0).getDestinacija());
		 * System.out.println(sb.toString() + ":: cena aranzmana :: " +
		 * ponuda.get(0).getCenaAranzmana() + " eura"); break; default:
		 * System.out.println("Pogresan unos"); break; }
		 */
		
	}
}
