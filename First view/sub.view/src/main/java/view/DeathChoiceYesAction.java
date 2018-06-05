package view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;


public class DeathChoiceYesAction extends AbstractAction{

	boolean choice;
	DeathScreen DS;
	
	public DeathChoiceYesAction(DeathScreen DS_p,boolean DChoice,String texte) {
		super(texte);
		
		this.DS = DS_p;
		this.choice = DChoice;
		this.choice = true;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(choice);
		//ctrl.DeathChoice(DChoice);
		DS.dispose();
	}

}
