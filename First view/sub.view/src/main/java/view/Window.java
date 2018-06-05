package view;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Base64.Decoder;

import javax.swing.JFrame;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;





public class Window extends JFrame {
	Panel p = new Panel(this);
		
	private static final long serialVersionUID = 1L;

	public Window() throws FileNotFoundException, JavaLayerException {
		super();
		
		build();
	}
	
	public void build() {
		setTitle("Lorann 2.0");
		setSize(660,486);
		setLocationRelativeTo(null); //Centre la fenêtre au milieu
		setResizable(true); //On interdit le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Quand on clique la croix l'appli se ferme
		setContentPane(p);
		//getContentPane().add(new TestGraphics());
		//pack();
		setVisible(true);
	   
		this.addKeyListener(p);
		
 Thread tr1 = new Thread() {
	 public void run(){
		 FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/main/java/view/image/song.mp3");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			AdvancedPlayer player = null;
			try {
				player = new AdvancedPlayer(fis);
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			player.setPlayBackListener(new PlaybackListener() {
			});
			try {
				player.play();
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	    }
	  };
	  tr1.start();
		
	}
}
