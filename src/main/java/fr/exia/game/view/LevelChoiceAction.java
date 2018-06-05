package fr.exia.game.view;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.AbstractAction;

import fr.exia.game.controller.ControllerFacade;
import fr.exia.game.model.ModelFacade;

/**
 * <h1>The Class LevelChoiceAction.</h1>
 *
 * @author Damien LAPORTE damien.laporte@viacesi.fr
 * @version 1.0
 */
public class LevelChoiceAction extends AbstractAction {

	/**
	 * The serial version unique ID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The GameDialog instance.
	 */
	private GameDialog dialog;
	
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
	 * Instantiates a level choice.
	 * 
	 * @param dialog_p
	 * 			the GameDialog instance
	 * @param pan_p
	 * 			the SettingPanel instance
	 * @param texte
	 * 			the text
	 * @param model
	 * 			the ModelFacade instance
	 * @param controller
	 * 			the ControllerFacade instance
	 */
	public LevelChoiceAction(GameDialog dialog_p, SettingPanel pan_p, String texte, ModelFacade model, ControllerFacade controller) {
		super(texte);
		this.p = pan_p;
		this.dialog = dialog_p;
		this.model = model;
		this.controller = controller;
	}
	
	/**
	 * Performs the action.
	 */
	public void actionPerformed(ActionEvent event) {
		Object lvl = p.getList().getSelectedItem();
		String lvlStr = lvl.toString();
		int lvlint = Integer.valueOf(lvlStr);
		dialog.dispose();
		
		try {
			//System.out.println(lvlint);
			//System.out.println(model.getMapById(1).getMap());
			new GameFrame(model.getMapById(lvlint), controller);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
