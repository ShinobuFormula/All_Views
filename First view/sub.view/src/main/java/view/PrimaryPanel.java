package view;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PrimaryPanel extends JPanel{

	public void paintComponent(Graphics g){
		g.clearRect(0,0, this.getWidth(), this.getHeight());
	    int x1 = this.getWidth()/4;
	    int y1 = this.getHeight()/4;                      
	    //g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
	    //g.drawImage(sprite, 200, 300, wind);
	    //g.drawImage(sprite2, 400, 450, wind);
	    
	  }
}
