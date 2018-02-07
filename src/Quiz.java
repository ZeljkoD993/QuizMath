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
		case 1:
			
			
				try {
					while(korisnikovUnos!=0) {
					int a = (int) (Math.random()*10);
					int b = (int) (Math.random()*10);
					
					System.out.println("Zbir brojeva: " + a + " + " + b + " je: ");
					
					int zbir = unos.nextInt();
					if(zbir == a + b) {
						System.out.println("Rezultat je: " + zbir);
					} 
					else {
						System.out.println("Pogresan rezultat");
						 }
					}
					
				} catch (Exception e) {
					System.out.println("Morate unjeti samo cijele brojeve");
				} 
			break;		
		case 2:
				try {
					while(korisnikovUnos!=0) {
						int a = (int) (Math.random()*10);
						int b = (int) (Math.random()*10);
						
						if(a > b)
						{
							System.out.println("Razlika brojeva: " + a + " - " + b + " je: "); 
							int razlika = unos.nextInt();
							if(razlika == a - b) {
								System.out.println("Razlika je: " + razlika);
							}else {
								System.out.println("Pogresan rezultat");
							}
						} else {
							
						}
						}
					
				} catch (Exception e) {
					System.out.println("Morate unjeti samo cijele brojeve");
				}
			
		
		break;
		
		case 3:
			try {
				while(korisnikovUnos!=0) {
					int a = (int) (Math.random()*10);
					int b = (int) (Math.random()*10);
					
					System.out.println("Proizvod brojeva " + a + " * " + b + " je: ");
					int proizod = unos.nextInt();
					
					if(proizod == a * b) {
						System.out.println("Proizvod je: " + proizod);
						
					}else {
						System.out.println("Pogresan rezultat");
					}
				}
				
			} catch (Exception e) {
				System.out.println("Morate unjeti samo cijele brojeve");
			}
			break;
			
		case 4:
			try {
				while(korisnikovUnos!=0) {
					int a = (int) (Math.random()*10);
					int b = (int) (Math.random()*10);
					
					System.out.println("Kolicnik brojeva " + a + " / " + b + " je: ");
					int kolicnik = unos.nextInt();
					if(a>b){
						if(kolicnik == a / b) {
							System.out.println("Proizvod je: " + kolicnik);
							
						}else {
							System.out.println("Pogresan rezultat");
						}
					} else {
					
					}
					
				}
				
			} catch (Exception e) {
				System.out.println("Morate unjeti samo cijele brojeve");
			}
			
			break;
		
		}
		
		}
		

}