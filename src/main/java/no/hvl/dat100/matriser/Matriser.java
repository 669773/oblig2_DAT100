package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		String matriseS = "";
		for(int i = 0; i < matrise.length; i++){
			matriseS+= "|";
			for(int j = 0; j < matrise[i].length; j++){
				matriseS += matrise[i][j];
				if(j != matrise[i].length -1){
					matriseS += ",";
				}

			}
			matriseS+= "|";
		}
		System.out.println(matriseS);
		//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String matriseS="";
		for(int i =0; i < matrise.length; i++){

			for(int j = 0; j< matrise[i].length; j++){
				matriseS += matrise[i][j];

				matriseS += " ";
			}
			matriseS += "\n";

		}
		return matriseS;
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalert = new int[matrise.length][matrise[0].length];
        for(int i = 0; i< matrise.length; i++){
            for(int j= 0; j< matrise[i].length; j++){
                skalert[i][j]= matrise[i][j]*tall;
            }
        }
        return skalert;
		//throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean like = true;
        if(a.length != b.length){
            return false;
        }
        for(int i=0; i< a.length; i++){
            if(a[i].length != b[i].length){
                return false;
            }
            for(int j=0; j< a[i].length; j++){
                if(a[i][j] != b[i][j]){
                    return false;

                }
            }
        }
        return like;
		//throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
