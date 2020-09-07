import java.io.*;

public class Lecture {
	
	private static final String FILENAME = "test.grd";
	
	public Lecture(){
	
		try {
			File fichier=new File(FILENAME);
			
			if(!fichier.exists()) {
				
				Erreur erreur=new Erreur(0);
				erreur.setVisible(true);
			}
			
			 FileReader reader = new FileReader(fichier);
			 BufferedReader read = new BufferedReader(reader);
			 
			 read.close();
			 
			 
		
		}catch (IOException e) {
		 	   e.printStackTrace();
		} 	
	}
}

