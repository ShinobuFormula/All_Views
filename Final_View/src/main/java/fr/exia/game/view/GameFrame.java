package fr.exia.game.view;

import javax.swing.JFrame;

import fr.exia.game.controller.ControllerFacade;
import fr.exia.game.model.Map;

/**
 * <h1>The Class GameFrame.</h1>
 *
 * @author Damien LAPORTE damien.laporte@viacesi.fr
 * @version 1.0
 */
public class GameFrame extends JFrame {

	/**
	 * The serial version unique ID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The GamePanel instance.
	 */
	private GamePanel gp;
	
	/**
	 * Instantiates a GameFrame.
	 * 
	 * @param map
	 * 			the Map instance
	 * @param controller
	 * 			the ControllerFacade instance
	 */
	public GameFrame(Map map, ControllerFacade controller) {
		gp = new GamePanel(this, map, controller);
		build();
	}
	
	/**
	 * Builds the window.
	 */
	public void build() {
		setTitle("Lorann 2.0");
		setSize(660,486);
		setLocationRelativeTo(null); //Put the window in the center of the screen
		setResizable(false); //to forbid the user to resize the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the app when the user click the red cross
		setContentPane(gp);
		setVisible(true);
		this.addKeyListener(gp);
	}
}
