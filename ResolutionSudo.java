public class ResolutionSudo {
	public static boolean All(int[][] tableau, int n) 
	{
        /*déclaration de variable*/
	    int ligne = -1; 
	    int colonne = -1; 
	    boolean okey = true; 
	    for (int i = 0; i < n; i++) 
	    { 
	        for (int j = 0; j < n; j++)  { 
	            if (tableau[i][j] == 0)  
	            { 
	                ligne = i;
	                colonne = j;
	                okey = false;  
	                break; 
	            } 
	        } 
	        if (!okey) { 
	            break; 
	        } 
	    }
	    if (okey) { 
	        return true; 
	    }
	    for (int num = 1; num <= n; num++) { 
	        if (valider(tableau, ligne, colonne, num)) { 
	            tableau[ligne][colonne] = num; 
	            if (ResolutionSudo.All(tableau, n)) {
	                return true; 
	            }  else { 
	                tableau[ligne][colonne] = 0;
	            } 
	        } 
	    } 
	    return false; 
	}

	public static boolean valider(int[][] tableau, int ligne, int colonne, int num) {
			for (int d = 0; d < tableau.length; d++) { 
				if (tableau[ligne][d] == num) { 
					return false; 
				} 
			} 
			for (int r = 0; r < tableau.length; r++) {
				if (tableau[r][colonne] == num) { 
					return false; 
				} 
			}
            
            /*déclaration de variables*/
			int sqrt = (int) Math.sqrt(tableau.length); 
			int boxLigneStart = ligne - ligne % sqrt; 
			int boxColonneStart = colonne - colonne % sqrt; 
	
			for (int r = boxLigneStart; r < boxLigneStart + sqrt; r++)  
			{ 
				for (int d = boxColonneStart; d < boxColonneStart + sqrt; d++)  
				{ 
					if (tableau[r][d] == num)  
				{ 
					return false; 
				} 
			} 
		}
	return true; 
	}

	public static int[][] print(int[][] tableau, int n) {

        /*déclaration des variables*/
	    int ligne = -1; 
	    int colonne = -1; 
	    boolean okey = true; 
	    for (int i = 0; i < n; i++) { 
	        for (int j = 0; j < n; j++)  { 
	            if (tableau[i][j] == 0)  { 
	                ligne = i;
	                colonne = j;
	                okey = false;  
	                break; 
	            } 
	        } 
	        if (!okey)  { 
	            break; 
	        } 
	    }
	    if (okey) { 
	        return tableau; 
	    }
	    for (int num = 1; num <= n; num++) { 
	        if (valider(tableau, ligne, colonne, num)) { 
	            tableau[ligne][colonne] = num; 
	            if (ResolutionSudo.All(tableau, n)) {
	                return tableau; 
	            }  
	            else
	            { 
	                tableau[ligne][colonne] = 0;
	            } 
	        } 
	    } 
	    return tableau; 
	}
}