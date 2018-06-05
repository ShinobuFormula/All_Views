package fr.exia.game.main;

import fr.exia.game.contract.IModel;
import fr.exia.game.controller.ControllerFacade;
import fr.exia.game.model.ModelFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Main {

	/**
	 * Starts the program.
	 */
	public static void main(String[] args) {
		IModel iModel = new ModelFacade();
		
		new ControllerFacade(iModel);
	}

}
