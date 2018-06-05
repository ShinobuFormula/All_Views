package view;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class Dialog extends JDialog {
	Panel p = new Panel();
	
	public Dialog() {
		super();
		
		build();
	}
	
	public void build() {
		setTitle("Lorann 2.0");
		setSize(300,100);
		setLocationRelativeTo(null); //Centre la fenêtre au milieu
		setResizable(false); //On interdit le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Quand on clique la croix l'appli se ferme
		setContentPane(p.buildContentPanel(this));
		setVisible(true);
	}
}
