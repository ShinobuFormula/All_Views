package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener{
	
	GameFrame gameFrm;
	//Player plyr;
	//Pawn map;
	int lor_flag; //Flag for the Lorann animation sprites
	
	public GamePanel(GameFrame gameFrm_p/*, Pawn map_p*/) {
		this.gameFrm = gameFrm_p;
		//this.map = map_p
	}

	//****Draw The Map****\\
	
	public void paint(Graphics g) {
		  super.paint(g);
		  g.clearRect(0,0, this.getWidth(), this.getHeight()); 
		  g.drawImage(getBackground(), 0, 0, gameFrm); 
		  
		  for(Pawn pwn :map) {
				g.drawImage(pwn.getSprite(), pwn.getX(), pwn.getY(), gameFrm);
			  }		  
		  }
		pwn.setY(0); pwn.setX(0); 
	  } */
	
	//****Animation****\\
	
	public Image getLorann() {
		  switch(lor_flag) {
		  case 1 : plyr.setLorann(plyr.getSprite(2)); lor_flag+=1;
		  repaint();
		  break;
		  case 2 : plyr.setLorann(plyr.getSprite(3)); lor_flag+=1;
		  repaint();
		  break;
		  case 3 : plyr.setLorann(plyr.getSprite(4)); lor_flag+=1;
		  repaint();
		  break;
		  case 4 : plyr.setLorann(plyr.getSprite(5)); lor_flag+=1;
		  repaint();
		  break;
		  case 5 : plyr.setLorann(plyr.getSprite(6)); lor_flag+=1;
		  repaint();
		  break;
		  case 6 : plyr.setLorann(plyr.getSprite(7)); lor_flag+=1;
		  repaint();
		  break;
		  case 7 : plyr.setLorann(plyr.getSprite(8)); lor_flag+=1;
		  repaint();
		  break;
		  case 8 : plyr.setLorann(plyr.getSprite(1)); lor_flag=1;
		  repaint();
		  break;
		   try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return plyr.getSprite();
		  } 
	
	
	
	//****KeyListener****\\
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_LEFT : //Pawn.move("LEFT")
		
		repaint();
		break;
		case KeyEvent.VK_RIGHT : //Pawn.move("RIGHT")
		repaint();
		break;
		case KeyEvent.VK_UP : //Pawn.move("UP")
		repaint();
		break;
		case KeyEvent.VK_DOWN : //Pawn.move("DOWN")
		repaint();
		break;
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub	
	}
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub	
	}
	
	
	
}
