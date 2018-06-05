package fr.exia.game.view;

import javax.swing.JDialog;
import javax.swing.JFrame;

import fr.exia.game.controller.ControllerFacade;
import fr.exia.game.model.ModelFacade;

/**
 * <h1>The Class GameDialog.</h1>
 *
 * @author Damien LAPORTE damien.laporte@viacesi.fr
 * @version 1.0
 */
public class GameDialog extends JDialog{

	/**
	 * The serial version unique ID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The SettingPanel instance.
	 */
	private SettingPanel p;
	
	/**
	 * The ModelFacade instance.
	 */
	private ModelFacade model;
	
	/**
	 * The ControllerFacade instance.
	 */
	private ControllerFacade controller;
	
	/**
	 * Instantiates a GameDialog.
	 * 
	 * @param p_p
	 * 			the SettingPanel instance
	 * @param model
	 * 			the ModelFacade instance
	 * @param controller
	 * 			the ControllerFacade instance
	 */
	public GameDialog(SettingPanel p_p, ModelFacade model, ControllerFacade controller) {
		this.controller = controller;
		this.model = model;
		this.p = p_p; //Getting my SettingPanel to call his method later
		build(); 
	}
	
	/**
	 * Builds the window.
	 */
	public void build() { //Setting my Dialog window 
		setTitle("Lorann 2.0");
		setSize(300,100);
		setLocationRelativeTo(null); //Put the window in the center of the screen
		setResizable(false); //forbid the user to resize the window
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Close when we click the red cross
		setContentPane(p.buildContentPanel(this, model, controller)); //Calling buildContent method by overloading
		setVisible(true);
	}
}
