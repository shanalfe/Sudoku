import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class ResolutionM extends JFrame{
	
	public ResolutionM(){

		int tab[][]= {{0,0,0,0,0,0,0,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,0,0,0,0,0,0}};
		
		int bool[][]= {{0,0,0,0,0,0,0,0,0},
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
		 
		 JFrame fenetre=new JFrame();
		 fenetre.setSize(900, 877);
		 fenetre.setLocation(250, 150);
		 fenetre.setTitle("Sudoku: Résolution Manuelle");
		 fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 GridLayout gestionnaire= new GridLayout(10,9);
		 fenetre.setLayout(gestionnaire);

		 JTextField[] area=new JTextField[81];
		 JLabel[] label=new JLabel[81];

		 for(int n=0;n<9;n++){
			    for(int i=0;i<9;i++){
			    
			    	if(tab[n][i]==0) {
			    		area[a] = new JTextField();
						area[a].setDocument(new JTextFieldLimit(4));
						area[a].setHorizontalAlignment(JTextField.CENTER);
						bool[n][i]=0;
						fenetre.add(area[a]);
			    					    	
			    	}else if(tab[n][i]!=0) {
			    		label[a]=new JLabel(""+tab[n][i]);
			    		bool[n][i]=1;
			    		label[a].setHorizontalAlignment(JLabel.CENTER);
			    		fenetre.add(label[a]);
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
		
		int verif=VerificationGrille.All(tab,false);
		 
		if(verif!=0) {
		 	 
		 	 Erreur error=new Erreur(1);
		 	 error.setVisible(true);
		}else if(verif==0) {
			
			/* ajout du bouton evenement et création du bouton événement pour fermer la fenetre */
			quitter.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e){
			        fenetre.dispose();
			    }
			});
			
			 
				valider.addActionListener(new ActionListener(){
					  public void actionPerformed(ActionEvent f){
						  
						  int verif2;
						  
						  int a=0;
						  
						      for(int n=0;n<9;n++){
						            for(int i=0;i<9;i++){
						                
						                try{
						                	if(bool[n][i]==0) {
							                	String txt=area[a].getText();
							                	int texte=Integer.parseInt(txt);
							                	tab[n][i]=texte;
							                	
						                	}else if(bool[n][i]==1) {
						                		String txt=label[a].getText();
							                	int texte=Integer.parseInt(txt);
							                	tab[n][i]=texte;
						                	}
						            				                	
						                }catch(java.lang.NumberFormatException e) {
						                	e.getStackTrace();
						                } 
						                a=a+1;
						            }
						        }
						      verif2=VerificationGrille.All(tab,true);
						      
						      if(verif2==0) {
						    	  Bravo bravo=new Bravo();
						    	  fenetre.dispose();
						    	  bravo.setVisible(true);
						      }
					  }
				});
				
				fenetre.setVisible(true);
		}
	}
}
