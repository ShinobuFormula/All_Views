package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SettingPanel {
	
	JPanel panel = new JPanel();
	GameDialog dialog;
	
	JLabel labl;
	JComboBox list;
	Object[] elements = new Object[] {"1", "2", "3", "4","5"}; //Choice of the level for the JComboBox
	
	//***BuildContentPane***\\
	public JPanel buildContentPanel(GameDialog dialog_p) { //Send the panel to the GameDialog
		this.dialog = dialog_p;
		
		labl = new JLabel("Bienvenue sur Lorann, Choississez un niveau");
		panel.add(labl);
		
		list = new JComboBox(elements);
		panel.add(list);
		
		JButton button = new JButton(new LevelChoiceAction(dialog,this,"Okay"));
		//Doing that will launch the actionPerformed method inside LevelChoiceAction and get the chosen level
		panel.add(button);
		
		return panel;
	}
	
	public JPanel buildContentPanel(boolean splash) { //Send the panel to the SplashWindow
			
			//panel.setLayout(null);
	
			//JLabel picLabel = new JLabel(getSplashImg()); 
			//panel.add(picLabel);
			
			return panel;
	}
	
	//***Getter***\\
	
	public JComboBox getList() {
		return list;
	}
	

}
