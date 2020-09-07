import java.awt.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class AffichageTemps extends JFrame {

    public AffichageTemps () {
        // public static void main(String[] args) {
            
        
        JFrame fenetre = new JFrame ();
        fenetre.setSize(500,200);
        fenetre.setLocation (1300,500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
   

            
    /* calcul du temps d'execution du programme ResolutionA */
    long start = System.nanoTime();
    long duree = System.nanoTime() - start;

    /*création d'un panneau pour le temps*/
    JLabel panneau = new JLabel("Le programme a mit " + "" + duree + " millisecondes" + " à s'exécuter !");
    panneau.setHorizontalAlignment(JLabel.CENTER);


    /* Affichage valeurs terminal*/
     System.out.println(duree + " millisecondes");

    
    /* affichage*/
    fenetre.add(panneau);
    fenetre.setVisible(true);

    }

}
