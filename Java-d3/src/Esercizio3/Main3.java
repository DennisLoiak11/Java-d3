package Esercizio3;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String innerStringa = "";
		
		while(!innerStringa.equals(":q")) {
			System.out.print("inserisci una stringa: ");
			innerStringa = scanner.nextLine();
			
			if(!innerStringa.equals(":q")) {
				StringheSuddivise.ciclaStringa(innerStringa);
			}
		}
		
		scanner.close();

	}

}
