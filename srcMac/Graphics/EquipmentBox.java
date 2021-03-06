package Graphics;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 * graphic box for equipment
 *
 */
public class EquipmentBox extends JPanel {
	private int arrowPos;
	private BufferedImage pause;
	private BufferedImage arrow;

	/**
	 * default constructor - initializes arrow position and images
	 */
	public EquipmentBox() {
		arrowPos = 0;
		try {
			pause = ImageIO.read(new File("Images////textBoxMac.png"));
			arrow = ImageIO.read(new File("Images////pointarrow.png"));
		} catch (IOException e /* | FontFormatException e */) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets arrow position in the window
	 * 
	 * @return arrow's position
	 */
	public int getArrowPos() {
		return 20 + arrowPos * 20;
	}

	/**
	 * Sets arrow position in the window
	 * 
	 * @return x - arrow's new position
	 */
	public void setArrowPos(int x) {
		arrowPos -= x;
	}

	/**
	 * Gets array position in the window
	 * 
	 * @return arrowPos - position of arrow
	 */
	public int getArrayPostion() {
		return arrowPos;
	}

	/**
	 * Updates graphics
	 */
	public void update() {
		repaint();
	}

	/**
	 * Renders equipment box in the window
	 */
	public void paintComponent(Graphics g) {
		g.drawImage(pause, 0, 0, 800, 150, null);
		g.drawImage(arrow, 10, getArrowPos(), 10, 10, null);
		g.setFont(new Font("Arial", Font.BOLD, 16));
		g.drawString("Armor", 25, 30);
		g.drawString("Weapons", 25, 50);
	}
}
