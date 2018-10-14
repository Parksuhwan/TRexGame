package userinterface;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GameWindow extends JFrame {
	
	public GameWindow() {
		super("Java T-Rex game");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main (String ars[]) {
		new GameWindow().setVisible(true);
	}
	
	public void paint(Graphics g) {
		BufferedImage image = null;
		image = ImageIO.read(new File("data/cactus1.png"));
		
	}
	
	

}
