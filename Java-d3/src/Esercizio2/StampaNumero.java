package Esercizio2;

public class StampaNumero {
	public static String TornaStringa(int num) {
		
		switch(num) {
		case 0 :
			return "zero";
		case 1 :
			return "uno";
		case 2 :
			return "due";
		case 3 :
			return "tre";
			
		default: return "errore";
		}
	}

}
