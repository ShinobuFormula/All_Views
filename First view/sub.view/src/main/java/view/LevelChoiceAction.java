package view;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

import javax.swing.AbstractAction;

import controller.ModeleFacade;
import javazoom.jl.decoder.JavaLayerException;

public class LevelChoiceAction extends AbstractAction{
	Dialog dil;
	private Panel pan;
	private ModeleFacade mdlFcd = new ModeleFacade();
	
	public LevelChoiceAction(Dialog dil_p,Panel pan_p, String texte) {
		super(texte);
		
		this.dil = dil_p;
		this.pan = pan_p;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object lvl = pan.getList().getSelectedItem();
		String lvlStr = lvl.toString();
		int lvlint = Integer.valueOf(lvlStr);
		dil.dispose();
		mdlFcd.setMap(lvlint);
		try {
			Window wind = new Window();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JavaLayerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
