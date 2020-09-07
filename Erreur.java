import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Erreur extends JFrame{
    
    public Erreur(int a){
        
        JFrame fenetre=new JFrame();
        fenetre.setSize(600, 400);
        fenetre.setLocation(350, 200);
        fenetre.setTitle("Message d'erreur ! ");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        if(a==0) {
            JLabel label1=new JLabel("Votre grille n'a pas encore été créée !");
            label1.setHorizontalAlignment(JLabel.CENTER);
            fenetre.add(label1, BorderLayout.CENTER);
        
        }else if(a==1) {
            JLabel label2=new JLabel("Votre grille ne peut pas être résolue. "+"Veuillez la recréer !");
            label2.setHorizontalAlignment(JLabel.CENTER);
            fenetre.add(label2, BorderLayout.CENTER);
        }
        
        JButton redirection=new JButton("Valider");
        fenetre.add(redirection, BorderLayout.SOUTH);
        
        redirection.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Choix a=new Choix();
                fenetre.dispose();
                a.setVisible(true);
            }
        });
        
        fenetre.setVisible(true);
    }
}
