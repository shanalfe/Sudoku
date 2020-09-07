import java.awt.Component;
import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Lecture {
	
	private Component getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	
    public Lecture(int[][] tableau){
    	
	     JFileChooser chooser = new JFileChooser();
	   	 FileNameExtensionFilter filter = new FileNameExtensionFilter(
	   	     "GRI Files", "gri");
	   	 chooser.setFileFilter(filter);
	   	 int returnVal = chooser.showOpenDialog(getParent());
	   	 if(returnVal == JFileChooser.APPROVE_OPTION) {
	   	    System.out.println("You chose to open this file: " +
	   	         chooser.getSelectedFile().getName());
	   	 }
	   	 
	   	final String FILENAME = chooser.getSelectedFile().getName();


        try {
            File fichier=new File(FILENAME);

            if(!fichier.exists()) {

                Erreur erreur=new Erreur(0);
                erreur.setVisible(true);
            }
             
             int tab[][]= {{0,0,0,0,0,0,0,0,0},
            		 {0,0,0,0,0,0,0,0,0},
            		 {0,0,0,0,0,0,0,0,0},
            		 {0,0,0,0,0,0,0,0,0},
            		 {0,0,0,0,0,0,0,0,0},
            		 {0,0,0,0,0,0,0,0,0},
            		 {0,0,0,0,0,0,0,0,0},
            		 {0,0,0,0,0,0,0,0,0},
            		 {0,0,0,0,0,0,0,0,0}};
             
             int i=0;
             int x;
             
             FileReader reader = new FileReader(FILENAME);
             
             BufferedReader read = new BufferedReader(reader); 
             
             String s = "";
             
             while((s=read.readLine())!= null){
            	 	
            	 for(int n=0;n<9;n++) {
            	 	String t=s.substring(n,(n+1));
            	 	x=Integer.parseInt(t);
            	 	tab[i][n]=x;
            	 	tableau[i][n]=tab[i][n];
            	 }
            	 
            	 i=i+1;
            	    
            }
             read.close();

        }catch (IOException e) {
                e.printStackTrace();
        
        }
    }
}
