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

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
