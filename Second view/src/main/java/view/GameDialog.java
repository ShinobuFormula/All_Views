package view;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class GameDialog extends JDialog{

	SettingPanel p;
	
	public GameDialog(SettingPanel p_p) {
		super();
		
		this.p = p_p; //Getting my SettingPanel to call his method later
		
		build(); 
	}
	
	public void build() { //Setting my Dialog window 
		setTitle("Lorann 2.0");
		setSize(300,100);
		setLocationRelativeTo(null); //Put the window in the center of the screen
		setResizable(false); //forbid the user to resize the window
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Close when we click the red cross
		setContentPane(p.buildContentPanel(this)); //Calling buildContent method by overloading
		setVisible(true);
	}
}
