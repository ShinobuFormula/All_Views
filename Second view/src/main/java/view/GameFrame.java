package view;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GamePanel gp = new GamePanel(this);
	
	public GameFrame() {
		super();
		
		build();
	}
	
	public void build() {
		setTitle("Lorann 2.0");
		setSize(645,384);
		setLocationRelativeTo(null); //Put the window in the center of the screen
		setResizable(false); //to forbid the user to resize the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the app when the user click the red cross
		setContentPane(gp);
		setVisible(true);
		this.addKeyListener(gp);
	}
}
