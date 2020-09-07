import java.awt.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.event.*;
import java.text.ParseException;

public class Elaboration extends JFrame{

    public Elaboration(){

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

 JFrame fenetre=new JFrame();
 fenetre.setSize(900, 877);
 fenetre.setLocation(250, 150);
 fenetre.setTitle("Sudoku : création de grille");
 fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 GridLayout gestionnaire= new GridLayout(10,9);
 fenetre.setLayout(gestionnaire);

 JFormattedTextField[] area=new JFormattedTextField[81]; 

 for(int n=0;n<9;n++){
    for(int i=0;i<9;i++){

        tab[n][i]=0;

        try{
			MaskFormatter number = new MaskFormatter("#");
			area[a] = new JFormattedTextField(number);
            area[a].setHorizontalAlignment(JFormattedTextField.CENTER);
			fenetre.add(area[a]);

			 
		}catch(ParseException e){
			e.printStackTrace();
		}
        
        a=a+1;
    }
}


/* espacement des boutons*/
for (int s =0; s<3; s++){
   fenetre.add(new JPanel());
}	

/* création des boutons valider et quitter */
JButton valider=new JButton("Valider");
fenetre.add(valider);
fenetre.add(new JPanel());
JButton quitter = new JButton("Quitter");
fenetre.add(quitter);

/* ajout du bouton evenement et création du bouton événement pour fermer la fenetre */
quitter.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        fenetre.dispose();
    }
});

valider.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent f){

        int a=0;

        for(int n=0;n<9;n++){
            for(int i=0;i<9;i++){
                
                try{
                	String txt=area[a].getText();
                	int texte=Integer.parseInt(txt);
                	tab[n][i]=texte;
                	System.out.print(tab[n][i]+",");
                	new Ecriture(tab);
            
                	
                }catch(java.lang.NumberFormatException e) {
                	System.out.print(tab[n][i]+",");
                }
                
                a=a+1;
            }

            System.out.println("");
        }
        Choix c=new Choix();
        fenetre.dispose();
        c.setVisible(true);
    }
});

fenetre.setVisible(true);
}
}
