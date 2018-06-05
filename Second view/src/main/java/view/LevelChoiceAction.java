package view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;



public class LevelChoiceAction extends AbstractAction {

	GameDialog dialog;
	SettingPanel p;
	//private ModeleFacade mdlFcd = new ModeleFacade(); //Model
	
	public LevelChoiceAction(GameDialog dialog_p,SettingPanel pan_p, String texte) {
		super(texte);
		this.p = pan_p;
		this.dialog = dialog_p;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object lvl = p.getList().getSelectedItem();
		String lvlStr = lvl.toString();
		int lvlint = Integer.valueOf(lvlStr);
		System.out.println(lvlint);
		dialog.dispose();
		GameFrame game = new GameFrame();
		//mdlFcd.setMap(lvlint); //Send the chosen map to the model
	}
}
