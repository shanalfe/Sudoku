import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ecriture {
 public Ecriture(int[][] tableau) {
  
  /* a faire si c'est ok*/
    try {
   
      File fichier = new File("test.grd");
   
      // création du fichier s'il n'existe pas
      if (!fichier.exists()) {
         fichier.createNewFile();
      }
      
      FileWriter ecriture = new FileWriter(fichier.getAbsoluteFile());
      BufferedWriter ecrire = new BufferedWriter(ecriture);
      
      for(int n=0;n<9;n++) {
         for(int i=0;i<9;i++) {
            
            String content =""+tableau[n][i];
            ecrire.write(content);
            
         }
         String content2="\n";
         ecrire.write(content2);
      }
      
      ecrire.close();
      
   
      /*message terminal pour dire que c'est ok*/
      System.out.println("Valeurs enregistrées ! ");
    
    }catch (IOException e) {
       e.printStackTrace();
      } 
 }
}
