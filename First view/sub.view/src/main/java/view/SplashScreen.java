package view;

import javax.swing.JPanel;
import javax.swing.JWindow;

public class SplashScreen extends JWindow{
	
	private static final long serialVersionUID = 1L;

	
	Panel p = new Panel();
	Boolean splash;
	public SplashScreen() {
		super();
		
		build();
		close();
	}
	
	public void build() {
		setSize(500,500);
		setLocationRelativeTo(null);
		setContentPane(p.buildContentPanel(splash));
		pack();
		setVisible(true);
		
	}
	
	public void close() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		Dialog dil = new Dialog();
		this.dispose();
	}
}
