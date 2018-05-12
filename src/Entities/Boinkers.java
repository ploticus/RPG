package Entities;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Boinkers extends Enemy {
	
	/**
	 * Default Constructor - loads enemy image
	 */
	public Boinkers() {
		isBoss = true;
		try {
			current = ImageIO.read(new File("Images\\bOinkers.png"));
		} catch (IOException e) {
			System.out.println("No Image Found: Enemy");
		}
	}

	/**
	 * Loaded Constructor - loads enemy image and x and y position
	 */
	
	public Boinkers(int x, int y) {
		super(x, y, "bOinkers", 15, 15, 10, 25, 3);
		isBoss = true;
		try {
			current = ImageIO.read(new File("Images\\bOinkers.png"));
		} catch (IOException e) {
			System.out.println("No Image Found: Enemy");
		}
	}

	/**
	 * Renders enemy
	 */
	public void draw(Graphics g) {
		g.drawImage(current, xPos, yPos, null);
	}

}
