package fr.exia.game.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JPanel;

import fr.exia.game.controller.ControllerFacade;
import fr.exia.game.model.Map;
import fr.exia.game.model.Monster;
import fr.exia.game.model.Pawn;
import fr.exia.game.model.Player;
import fr.exia.game.model.Spell;
import fr.exia.game.model.enums.Action;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackListener;

/**
 * <h1>The Class GamePanel.</h1>
 *
 * @author Damien LAPORTE damien.laporte@viacesi.fr
 * @version 1.0
 */
public class GamePanel extends JPanel implements KeyListener {

	/**
	 * The serial version unique ID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The ControllerFacade instance.
	 */
	private ControllerFacade controller;
	
	/**
	 * The GameFrame instance.
	 */
	private GameFrame gameFrm;
	
	/**
	 * The Player instance.
	 */
	private Player player;
	
	/**
	 * The Map instance.
	 */
	private Map map;
	
	/**
	 * The attribute monsterMove.
	 */
	private boolean monsterMove;
	
	/**
	 * The attribute flag.
	 */
	private int flag; // Flag for the Lorann animation sprites

	/**
	 * Instantiates a GamePanel.
	 * 
	 * @param gameFrm_p
	 * 			the GameFrame instance
	 * @param map_p
	 * 			the Map instance
	 * @param controller
	 * 			the ControllerFacade instance
	 */
	public GamePanel(GameFrame gameFrm_p, Map map_p, ControllerFacade controller) {
		this.gameFrm = gameFrm_p;
		this.controller = controller;
		this.map = map_p;
		map.build();
		flag = 1;
		monsterMove = false;

		Thread tr1 = new Thread() {
			public void run() {
				FileInputStream fis = null;
				try {
					fis = new FileInputStream("src/main/java/fr/exia/game/view/music/music.mp3");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				AdvancedPlayer player = null;
				try {
					player = new AdvancedPlayer(fis);
				} catch (JavaLayerException e) {
					e.printStackTrace();
				}
				player.setPlayBackListener(new PlaybackListener(){});
				try {
					player.play();
				} catch (JavaLayerException e) {
					e.printStackTrace();
				}
			}
		};
		tr1.start();
	}

	/**
	 * Paints the panel components.
	 */
	public void paint(Graphics g) {
		super.paint(g);
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 645, 384);
		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 25)); 
        g.drawLine(0, 390, 680, 390);
        g.drawString("Score : "+controller.getScore() , 10, 425);
        g.drawLine(330, 390, 330, 486);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 13)); 
        g.drawString("Déplacements = Touche directionelle <- ->", 340, 410);
        g.drawString("Sortilège = Touche espace", 340, 430);

		for (Pawn pwn : map.getPawns()) {
			if(pwn instanceof Player) {
				player = (Player) pwn;
				g.drawImage(player.getSprite(flag), player.getX(), player.getY(), gameFrm);
			} else {
				g.drawImage(pwn.getSprite(), pwn.getX(), pwn.getY(), gameFrm);
			}
			//System.out.println(pwn.getClass().toString()+" > "+pwn.getX() +":"+pwn.getY());
		}
		
		try {
			Thread.sleep(75);
			flag++;
			repaint();
			if(flag == 8) flag = 1;
			if(monsterMove == false) {
				monsterMove = true;
				for (Pawn pwn : map.getPawns()) {
					if(pwn instanceof Monster) {
						Monster m = (Monster) pwn;
						m.move(player, map);
					}
				}
			} else {
				for (Pawn pwn : map.getPawns()) {
					if(pwn instanceof Spell) {
						Spell s = (Spell) pwn;
						s.move(map);
						s.changeColor();
					}
				}
				monsterMove = false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Listens the key pressed on the keyboard.
	 */
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_LEFT:
			controller.play(Action.MOVE_LEFT, map);
			repaint();
			break;
		case KeyEvent.VK_RIGHT:
			controller.play(Action.MOVE_RIGHT, map);
			repaint();
			break;
		case KeyEvent.VK_UP:
			controller.play(Action.MOVE_UP, map);
			repaint();
			break;
		case KeyEvent.VK_DOWN:
			controller.play(Action.MOVE_DOWN, map);
			repaint();
			break;
		case KeyEvent.VK_SPACE:
			controller.play(Action.SHOOT, map);
			repaint();
			break;
		}
	}

	/**
	 * Inherited method.
	 */
	public void keyTyped(KeyEvent e) {}

	/**
	 * Inherited method.
	 */
	public void keyReleased(KeyEvent e) {}

}
