package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ModeleFacade;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public class Panel extends JPanel implements KeyListener{
	Window wind;
	
	
	
	private static final long serialVersionUID = 1L;
	
	ImageIcon image1 = new ImageIcon(getClass().getResource("Lorann_Logo.jpg"));
	//Window wind = new Window();
	JPanel panel = new JPanel();
	ModeleFacade fcd = new ModeleFacade();
	Dialog dil;
	JLabel labl;
	
	boolean DChoice;
	Image sprite;
	Image bone_hori;
	Image bone_vert;
	Image bone_corn;
	Image lorann;
	Image door;
	Image ball;
	Image monster;
	Image purse;
	
	int lor_flag = 1;
	Image lorann_1;
	Image lorann_2;
	Image lorann_3;
	Image lorann_4;
	
	Image lorann_5;
	Image lorann_6;
	Image lorann_7;
	Image lorann_8;
	
	JComboBox list;
	Object[] elements = new Object[] {"1", "2", "3", "4","5"};
	String[] map = new String[] {"C","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","C","*",
			"|","$","#","#","#","#","#","C","#","#","C","#","#","#","#","#","#","E","#","|","*",
			"|","#","M","#","#","#","#","#","#","#","#","#","$","#","#","#","#","#","#","|","*",
			"|","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","|","*",
			"|","#","#","#","#","#","$","|","#","#","C","#","#","#","#","#","#","#","#","|","*",
			"|","C","-","-","-","-","-","C","#","#","C","-","-","-","-","-","-","-","C","|","*",
			"|","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","M","#","|","*",
			"|","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","|","*",
			"|","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","|","*",
			"|","#","P","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","|","*",
			"|","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","D","|","*",
			"C","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","C"	 };
	
	public Panel() {
		
	}
	
	public Panel(Window wind_p) {
		this.wind = wind_p;
		
		try {
			this.sprite = ImageIO.read(this.getClass().getResourceAsStream("image/Greyound.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			this.ball = ImageIO.read(this.getClass().getResourceAsStream("crystal_ball.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.door = ImageIO.read(this.getClass().getResourceAsStream("gate_closed.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.purse = ImageIO.read(this.getClass().getResourceAsStream("purse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.monster = ImageIO.read(this.getClass().getResourceAsStream("monster_1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	try {
		this.bone_hori = ImageIO.read(this.getClass().getResourceAsStream("horizontal_bone.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.bone_vert = ImageIO.read(this.getClass().getResourceAsStream("vertical_bone.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.bone_corn = ImageIO.read(this.getClass().getResourceAsStream("bone.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann = ImageIO.read(this.getClass().getResourceAsStream("lorann_bl.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann_1 = ImageIO.read(this.getClass().getResourceAsStream("lorann_bl.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann_2 = ImageIO.read(this.getClass().getResourceAsStream("lorann_b.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann_3 = ImageIO.read(this.getClass().getResourceAsStream("lorann_br.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann_4 = ImageIO.read(this.getClass().getResourceAsStream("lorann_r.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann_5 = ImageIO.read(this.getClass().getResourceAsStream("lorann_ur.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann_6 = ImageIO.read(this.getClass().getResourceAsStream("lorann_u.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann_7 = ImageIO.read(this.getClass().getResourceAsStream("lorann_ul.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		this.lorann_8 = ImageIO.read(this.getClass().getResourceAsStream("lorann_l.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	

	
	public JPanel buildContentPanel(Boolean splash) { //J'envoie mon panel dans la méthode build
		
		//panel.setLayout(null);

		JLabel picLabel = new JLabel(image1);

		panel.add(picLabel);
		
		
	//	panel.setBackground(Color.black);
		return panel;
}
	public JPanel buildContentPanel(Dialog dil_p) {
		this.dil = dil_p;
		labl = new JLabel("Bienvenue sur Lorann, Choississez un niveau");
		panel.add(labl);
		
		list = new JComboBox(elements);
		panel.add(list);
		
		JButton button = new JButton(new LevelChoiceAction(dil,this,"Okay"));
		panel.add(button);
		
		return panel;
	}
	
	public JPanel buildContentPanel(DeathScreen DS) {
		
		labl = new JLabel("Bienvenue en enfer, voulez retourner dans le monde des vivants?");
		panel.add(labl);
		
		JButton buttonY = new JButton(new DeathChoiceYesAction(DS,DChoice,"Vivre?"));
		panel.add(buttonY);
		
		JButton buttonN = new JButton(new DeathChoiceNoAction(DS,DChoice,"Mourir?"));
		panel.add(buttonN);
		
		return panel;
	}
	
	
	  public void paint(Graphics g) {
		  
		  super.paint(g);
		  g.clearRect(0,0, this.getWidth(), this.getHeight()); 
		  g.drawImage(sprite, 0, 0, wind);
		  g.setFont(new Font("TimesRoman", Font.PLAIN, 25)); 
		  g.drawLine(0, 390, 680, 390);
		  g.drawString("Score : 480" , 10, 425);
		  g.drawLine(330, 390, 330, 486);
		  g.setFont(new Font("TimesRoman", Font.PLAIN, 13)); 
		  g.drawString("Déplacements = Touche directionelle <- ->", 340, 410);
		  g.drawString("Sortilège = Touche espace", 340, 430);
		  
		  for(String mp :map) {
			  switch(mp) {
			  case "-" : g.drawImage(bone_hori, fcd.getX(), fcd.getY(), wind);
			  fcd.addX(32);
			  break;
			  case "#": fcd.addX(32);
			  break;
			  case "$": g.drawImage(purse, fcd.getX(), fcd.getY(), wind);  fcd.addX(32);
			  break;
			  case "*": fcd.setX(0); fcd.addY(32);
			  break;
			  case "|": g.drawImage(bone_vert, fcd.getX(), fcd.getY(), wind);  fcd.addX(32); 
			  break;
			  case "C": g.drawImage(bone_corn, fcd.getX(), fcd.getY(), wind);  fcd.addX(32); //System.out.println("sorti !");
			  break;
			  case "P": g.drawImage(getLorann(), fcd.getX(), fcd.getY(), wind);  fcd.addX(32);
			  break;
			  case "M": g.drawImage(monster, fcd.getX(), fcd.getY(), wind);  fcd.addX(32);
			  break;
			  case "E": g.drawImage(ball, fcd.getX(), fcd.getY(), wind);  fcd.addX(32);
			  break;
			  case "D": g.drawImage(door, fcd.getX(), fcd.getY(), wind);  fcd.addX(32);
			  break;
			  }
		  }
		fcd.setY(0); fcd.setX(0); 
	  }
	  
	  
	  public void Death() {
		  DeathScreen DS = new DeathScreen(this);
	  }
	  
	  
	  public Image getLorann() {
		  switch(lor_flag) {
		  case 1 : lorann = lorann_2; lor_flag+=1;
		  repaint();
		  break;
		  case 2 : lorann = lorann_3; lor_flag+=1;
		  repaint();
		  break;
		  case 3 : lorann = lorann_4; lor_flag+=1;
		  repaint();
		  break;
		  case 4 : lorann = lorann_5; lor_flag+=1;
		  repaint();
		  break;
		  case 5 : lorann = lorann_6; lor_flag+=1;
		  repaint();
		  break;
		  case 6 : lorann = lorann_7; lor_flag+=1;
		  repaint();
		  break;
		  case 7 : lorann = lorann_8; lor_flag+=1;
		  repaint();
		  break;
		  case 8 : lorann = lorann_1; lor_flag=1;
		  repaint();
		  break;
		  }
		  try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return lorann;
	  }
	
		public JComboBox getList() {
			return list;
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			switch(key) {
			
			case KeyEvent.VK_LEFT : fcd.subLX(32);
			//System.out.println(fcd.getLX());
			repaint();
			break;
			case KeyEvent.VK_RIGHT : fcd.addLX(32);
			Death();
			repaint();
			break;
			case KeyEvent.VK_UP : fcd.subLY(32);
			repaint();
			break;
			case KeyEvent.VK_DOWN : fcd.addLY(32);
			repaint();
			break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	
}