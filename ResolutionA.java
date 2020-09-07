import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;


public class ResolutionA extends JFrame {

    public ResolutionA () {

    // public static void main(String[] args){

         int tab[][]= {{0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0}};

         int a=0;
 
         new Lecture(tab);
         int verif=VerificationGrille.All(tab,false);
                   
         if(verif!=0) {
             Erreur error=new Erreur(1);
            error.setVisible(true);
                     
                   }else if(verif==0) {

                       /*création de la fenetre avec la grille*/
                        JFrame fenetre=new JFrame();
                        fenetre.setSize(900, 877);
                        fenetre.setLocation(250, 150);
                        fenetre.setTitle("Sudoku: résolution automatique");
                        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        /*création de la fenetre avec le temps*/
                        JFrame window = new JFrame ();
                        window.setSize(500,200);
                        window.setLocation (1200,200);
                        window.setTitle("Temps d'exécution du programme.");
                        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
                          /*programme de résolution : appel*/
                            try{
                          int x = tab.length;
                         if(ResolutionSudo.All(tab,x) ){
                         tab=ResolutionSudo.print(tab,x);
                         System.out.print(""+ tab);
                           }else {
                              Erreur erreur = new Erreur(0);
                          }                          
                      }catch (ArrayIndexOutOfBoundsException e){
                   e.getStackTrace();
               }        
        
              
                        
                        GridLayout gestionnaire= new GridLayout(10,9);
                        fenetre.setLayout(gestionnaire);
               
                      
                        JLabel[] label=new JLabel[81];
               
                        for(int n=0;n<9;n++){
                               for(int i=0;i<9;i++){                               
                                  
                                       label[a]=new JLabel(""+tab[n][i]);
                                       label[a].setHorizontalAlignment(JLabel.CENTER);
                                       fenetre.add(label[a]);
                                                     
                                   
                                   a=a+1;
                           }
                       }
               
       
                /* espacement des boutons*/
                for (int s =0; s<4; s++){
                    fenetre.add(new JPanel());
                }	
                     
        /* création des boutons  quitter */
    
            
        JButton quitter = new JButton("Quitter");
             fenetre.add(quitter);
               
        
         /* ajout du bouton evenement et création du bouton événement pour fermer la fenetre */
         quitter.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                  fenetre.dispose();
                   window.dispose();
             }
          });
                                     
                           

              /* calcul du temps d'execution du programme ResolutionA */
            long start = System.nanoTime();
             long duree = System.nanoTime() - start;

   
             /*création d'un panneau pour le temps*/
             JLabel panneau = new JLabel("Le programme a mit " + "" + duree + " millisecondes" + " à s'exécuter !");
            panneau.setHorizontalAlignment(JLabel.CENTER);


    /* Affichage valeurs terminal*/
     System.out.println(duree + " millisecondes");
     window.add(panneau);         

     fenetre.setVisible(true);
     window.setVisible(true);
               

         }        

    }

}





