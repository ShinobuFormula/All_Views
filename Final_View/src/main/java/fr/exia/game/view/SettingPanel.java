package fr.exia.game.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.exia.game.controller.ControllerFacade;
import fr.exia.game.model.ModelFacade;

/**
 * <h1>The Class SettingPanel.</h1>
 *
 * @author Damien LAPORTE damien.laporte@viacesi.fr
 * @version 1.0
 */
public class SettingPanel {
	
	/**
	 * The JPanel instance.
	 */
	private JPanel panel = new JPanel();
	
	/**
	 * The GameDialog instance.
	 */
	private GameDialog dialog;
	
	/**
	 * The JLabel instance.
	 */
	private JLabel labl;
	
	/**
	 * The JComboBox instance.
	 */
	@SuppressWarnings("rawtypes")
	private JComboBox list;
	
	/**
	 * The levels available.
	 */
	Object[] elements = new Object[]{"1", "2", "3", "4","5"};
	
	/**
	 * Builds the level choice window.
	 * 
	 * @param dialog_p
	 * 			the GameDialog instance
	 * @param model
	 * 			the ModelFacade instance
	 * @param controller
	 * 			the ControllerFacade instance
	 * @return the JPanel instance
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JPanel buildContentPanel(GameDialog dialog_p, ModelFacade model, ControllerFacade controller) { //Send the panel to the GameDialog
		panel = new JPanel();
		this.dialog = dialog_p;
		
		labl = new JLabel("Welcome on Lorann! Choose a level:");
		panel.add(labl);
		
		list = new JComboBox(elements);
		panel.add(list);
		
		JButton button = new JButton(new LevelChoiceAction(dialog, this, "Okay", model, controller));
		//Doing that will launch the actionPerformed method inside LevelChoiceAction and get the chosen level
		panel.add(button);
		
		return panel;
	}
	
	/**
	 * Builds the splash window.
	 * 
	 * @param splash
	 * 			the splash attribute
	 * @return the JPanel instance
	 */
	public JPanel buildContentPanel(boolean splash) { //Send the panel to the SplashWindow
			JLabel picLabel = new JLabel(new ImageIcon(getClass().getResource("images/Lorann_logo.jpg")));
			panel.add(picLabel);
			
			return panel;
	}

	/**
	 * Gets the JComboBox instance.
	 * 
	 * @return the JComboBox instance
	 */
	@SuppressWarnings("rawtypes")
	public JComboBox getList() {
		return list;
	}

}
