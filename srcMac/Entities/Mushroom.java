package Entities;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mushroom extends Enemy {

	/**
	 * Default Constructor - loads enemy image
	 */
	public Mushroom() {
		try {
			current = ImageIO.read(new File("Images//mushroom.png"));
		} catch (IOException e) {
			System.out.println("No Image Found: Enemy");
		}
	}

	/**
	 * Loaded Constructor - loads enemy image and x and y position
	 */
	public Mushroom(int x, int y) {
		super(x, y, "Mushroom", 15, 15, 10, 25, 3);
		try {
			current = ImageIO.read(new File("Images//mushroom.png"));
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