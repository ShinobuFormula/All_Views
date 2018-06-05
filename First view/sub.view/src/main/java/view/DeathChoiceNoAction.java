package view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;


public class DeathChoiceNoAction extends AbstractAction{

	boolean choice;
	DeathScreen DS;
	
	public DeathChoiceNoAction(DeathScreen DS_p,boolean DChoice,String texte) {
		super(texte);
		
		this.DS = DS_p;
		this.choice = DChoice;
		this.choice = false;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(choice);
		//ctrl.DeathChoice(DChoice);
		DS.dispose();
	}

}
