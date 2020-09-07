import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Reso extends JFrame {
    public Reso() {
        JFrame fenetre = new JFrame();
        fenetre.setSize(900, 800);
        fenetre.setLocation(200, 200);
        fenetre.setTitle("Sudoku");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* boutons menu */
        fenetre.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 300));

        JButton auto = new JButton("Résolution automatique");
        auto.setPreferredSize(new Dimension(250, 100));
        fenetre.add(auto);

        JButton man = new JButton("Résolution manuelle");
        man.setPreferredSize(new Dimension(250, 100));
        fenetre.add(man);

        JButton retour = new JButton("Retour");
        retour.setPreferredSize(new Dimension(100, 100));
        fenetre.add(retour);


        
        /* ajout evenement résolution automatique */

        auto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent i) {
                ResolutionA w = new ResolutionA();
                fenetre.dispose();
                w.setVisible(true);
            }

        });

        /* ajout evenement résolution manuelle */

        man.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent p){
            ResolutionM w = new ResolutionM();
            fenetre.dispose();
            w.setVisible(true);
            }

        });

        /* ajout evenement retour */

        retour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent u) {
                Choix w = new Choix();
                fenetre.dispose();
                w.setVisible(true);
            }

        });
        

        fenetre.setVisible(true);

    }

}