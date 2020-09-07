import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class Choix extends JFrame{
	
	public Choix() {
    JFrame fenetre=new JFrame();
		fenetre.setSize(900, 800);
        fenetre.setLocation(200, 200);
        fenetre.setTitle("Sudoku");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   

		/* boutons menu*/  
		fenetre.setLayout(new FlowLayout(FlowLayout.CENTER, 0,300));
		
		JButton creation = new JButton("Création d'une grille");
		creation.setPreferredSize(new Dimension(250,100));
		fenetre.add(creation);
 
		 JButton reso = new JButton("Résolution");
		reso.setPreferredSize(new Dimension(250,100));
        fenetre.add(reso);
        
        JButton retour = new JButton("Quitter le jeu");
        retour.setPreferredSize(new Dimension(100,100));
        fenetre.add(retour);
        

		 /* ajout evenement création de la grille */
		
        creation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent i){
            Elaboration a = new Elaboration();
            fenetre.dispose();
            a.setVisible(true);
            }
            
        });
		
		
        /* évenement bouton  résolution automatique*/
        reso.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent o){
            Reso b = new Reso();
            fenetre.dispose();
            b.setVisible(true);
            }
            
        });


		 /* ajout evenement quitter*/
		
         retour.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent z){
          fenetre.dispose();
         
            }
            
        });
    
        fenetre.setVisible(true);
}

}