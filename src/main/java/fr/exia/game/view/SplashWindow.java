package fr.exia.game.view;

import javax.swing.JWindow;

import fr.exia.game.controller.ControllerFacade;
import fr.exia.game.model.ModelFacade;

/**
 * <h1>The Class SplashWindow.</h1>
 *
 * @author Damien LAPORTE damien.laporte@viacesi.fr
 * @version 1.0
 */
public class SplashWindow extends JWindow{

	/**
	 * The serial version unique ID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The ControllerFacade instance.
	 */
	private ControllerFacade controller;
	
	/**
	 * The splash attribute.
	 */
	private boolean splash; //Parameter to overload the contentPane method
	
	/**
	 * The SettingPanel instance.
	 */
	private SettingPanel p; //Creating a SettingPanel
	
	/**
	 * Instantiates a new SplashWindow.
	 * 
	 * @param model
	 * 			the model instance
	 * @param controller
	 * 			the controller instance
	 */
	public SplashWindow(ModelFacade model, ControllerFacade controller) {
		this.controller = controller;
		this.p = new SettingPanel();
		build(); 
		close(model);
	}
	
	/**
	 * Builds the window.
	 */
	public void build() { //Setting my SplashWindow
		setSize(500,500);
		setLocationRelativeTo(null); //Put the window in the center of the screen
		setContentPane(p.buildContentPanel(splash)); //Setting the content pane by calling the buildContent Method 
		pack(); //Remove unused space in the window, center on the image
		setVisible(true); //Make the window visible
	}
	
	/**
	 * Close the window.
	 * 
	 * @param model
	 * 			the ModelFacade instance
	 */
	public void close(ModelFacade model) { //After 5 second it opens the Dialog window
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		new GameDialog(p, model, controller); //Create a dialog window
		this.dispose();
	}
}
