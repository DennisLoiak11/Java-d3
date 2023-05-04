package Esercizio3;

public class StringheSuddivise {
	
	public static void ciclaStringa(String str) {
		
		String [] caratteri = str.split("");
		for(int i = 0; i<caratteri.length; i++) {
			System.out.print(caratteri[i]);
			if(i<caratteri.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

}
