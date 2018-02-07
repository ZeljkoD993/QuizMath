import java.util.Scanner;

public class Quiz {
	
	static Scanner unos = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite zeljenu opciju:");
		System.out.println("1. Sabiranje");
		System.out.println("2. Oduzimanje");
		System.out.println("3. Mnozenje");
		System.out.println("4. Djeljenje");
		System.out.println("5. Korjenovanje");
		System.out.println("6. Kvadriranje");
		System.out.println("-------------------");
		
		int korisnikovUnos = unos.nextInt();
		
		switch (korisnikovUnos) {
		case 5:
			
			
				try {
					while(korisnikovUnos!=0) {
					int a = (int) (Math.random()*10);
					
					
					System.out.println("Korijen broja: " + a  + " je: ");
					
					int korijen = unos.nextInt();
					if(korijen == a * a) {
						System.out.println("Rezultat je: " + korijen);
					} 
					else {
						System.out.println("Pogresan rezultat");
						 }
					}
					
				} catch (Exception e) {
					System.out.println("Morate unjeti samo cijele brojeve");
				} 
			break;		
		
		
		}
	}

}