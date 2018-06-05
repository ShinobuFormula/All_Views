package view;

import javax.swing.JWindow;

public class SplashWindow extends JWindow{

	SettingPanel p = new SettingPanel(); //Creating a SettingPanel
	boolean splash; //Parameter to overload the contentPane method
	
	public SplashWindow() {
		super();
		
		build(); 
		close();
	}
	
	public void build() { //Setting my SplashWindow
		setSize(500,500);
		setLocationRelativeTo(null); //Put the window in the center of the screen
		setContentPane(p.buildContentPanel(splash)); //Setting the content pane by calling the buildContent Method 
		//pack(); //Remove unused space in the window, center on the image
		setVisible(true); //Make the window visible
		
	}
	
	public void close() { //After 5 second it opens the Dialog window
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		GameDialog dialog = new GameDialog(p); //Create a dialog window
	}
}
