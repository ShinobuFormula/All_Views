package view;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class DeathScreen extends JDialog {
	Panel p;	
	
			public DeathScreen(Panel p_p) {
				super();
				
				this.p = p_p;
				
				build();
			}
			
			public void build() {
				setTitle("Vous êtes mort...");
				setSize(400,100);
				setLocationRelativeTo(null); //Centre la fenêtre au milieu
				setResizable(false); //On interdit le redimensionnement de la fenêtre
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Quand on clique la croix l'appli se ferme
				setContentPane(p.buildContentPanel(this));
				setVisible(true);
			}
}
