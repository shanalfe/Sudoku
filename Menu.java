import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.Dimension;


public class Menu {
    
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();  
           
        fenetre.setSize(900,800);
        fenetre.setLocation(200,200);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setTitle("Sudoku");    
         
      
       fenetre.setLayout(new FlowLayout(FlowLayout.CENTER, 0,300));

       /* boutons menu*/
       
       JButton jouer = new JButton("Jouer");
       jouer.setPreferredSize(new Dimension(250,100));
       fenetre.add(jouer);

        JButton quitter = new JButton("Quitter le jeu");
       quitter.setPreferredSize(new Dimension(250,100));
       fenetre.add(quitter);
  
    
        /* ajout du bouton evenement et création du bouton événement pour fermer la fenetre */
        quitter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fenetre.dispose();
            }
        });
   

        /* évenement bouton ouverture sudoku*/
        jouer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent i){
            Choix e = new Choix();
            fenetre.dispose();
            e.setVisible(true);
            }
            
        });
        
        fenetre.setVisible(true);    
    }   
}
