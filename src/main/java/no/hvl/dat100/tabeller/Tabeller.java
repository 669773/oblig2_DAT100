package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		String tabellS="";
		for(int i= 0; i < tabell.length; i++) {
			tabellS = tabell[i] + " | ";
		}
		System.out.print(tabellS);
		//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tabellString ="";
        for (int i = 0; i < tabell.length; i++) {
            tabellString += Integer.toString(tabell[i]);
			if( i != tabell.length -1){
				tabellString += ",";
			}
        }
		return "[" + tabellString + "]";
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for(int i = 0; i < tabell.length; i++){
			sum += tabell[i];
		}
		return sum;
		//throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean inneholder = false;
		for(int i = 0; i < tabell.length; i++){
			if(tabell[i] == tall){
				inneholder =  true;
			}
		} return inneholder;
		//throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int indeks = -1;
		for( int i = 0; i < tabell.length;i++){
			if(tabell[i] == tall){
				indeks = i;
				break;
			}
		}return indeks;
		//throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversert = new int[tabell.length];
		for(int i = 0; i< tabell.length; i++){
				reversert[i] = tabell[tabell.length -1 - i];
		}
		return reversert;
		//throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean erStigende = true;
		for(int i = 0; i < tabell.length; i++){
			if(i != tabell.length-1){
			if(tabell[i] >= tabell[i+1]){
					erStigende = false;
			}}
		} return erStigende;
		//throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTabell = new int[tabell1.length+tabell2.length];

		for(int j = 0; j < tabell1.length; j++){
			nyTabell[j] = tabell1[j];
		}
		for(int i=0; i< tabell2.length; i++){
			nyTabell[i+tabell1.length]= tabell2[i];
		}

		return nyTabell;
		}

		//throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}

