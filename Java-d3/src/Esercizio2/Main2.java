package Esercizio2;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("inserisci un numero intero compreso tra 0 e 3:");
		
		int num = scanner.nextInt();
		
		String numeroStringa = StampaNumero.TornaStringa(num);
		System.out.println(numeroStringa);
		
		scanner.close();

	}

}
