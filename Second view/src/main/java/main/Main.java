package main;

import contract.IModel;
import contract.IView;
import controller.ControllerFacade;
import view.GameDialog;
import view.SplashWindow;

public class Main {

	public static void main(String[] args) {
		IView iView = null;
		IModel iModel = null;
		
		ControllerFacade ctrl = new ControllerFacade(iView, iModel);

	}

}
