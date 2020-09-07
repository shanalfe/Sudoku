    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    import javax.swing.*;

    public class Bravo extends JFrame{
    	
    	public Bravo() {
    		
    		 JFrame fenetre=new JFrame();
    		 fenetre.setSize(250, 200);
    		 fenetre.setLocation(510, 300);
    		 fenetre.setTitle("Bravo !");
    		 fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		 
    		 JLabel label =new JLabel("BRAVO ! Vous avez résolu la grille !");
    		 label.setHorizontalAlignment(JLabel.CENTER);
    		 JButton fin = new JButton("Fin");
    		 fenetre.add(label,BorderLayout.CENTER);
    		 fenetre.add(fin,BorderLayout.SOUTH);
    		 
    		 fin.addActionListener(new ActionListener(){
    			    public void actionPerformed(ActionEvent e){
    			        fenetre.dispose();
    			    }
    			});
    		 
    		 fenetre.setVisible(true);
    	}
    }
