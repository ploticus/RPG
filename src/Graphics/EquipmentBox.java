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

public class EquipmentBox extends JPanel {
	private int arrowPos;
	private BufferedImage pause;
	private BufferedImage arrow;

	public EquipmentBox() {
		arrowPos = 0;
		try {
			pause = ImageIO.read(new File("Images\\textBox.png"));
			arrow = ImageIO.read(new File("Images\\pointarrow.png"));
		} catch (IOException e /* | FontFormatException e */) {
			e.printStackTrace();
		}
	}

	public int getArrowPos() {
		return 20 + arrowPos * 20;
	}

	public void setArrowPos(int x) {
		arrowPos -= x;
	}

	public int getArrayPostion() {
		return arrowPos;
	}

	public void update() {
		repaint();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(pause, 0, 0, 800, 150, null);
		g.drawImage(arrow, 10, getArrowPos(), 10, 10, null);
		g.setFont(new Font("Arial", Font.BOLD, 16));
		g.drawString("Armor", 25, 30);
		g.drawString("Weapons", 25, 50);
	}
}