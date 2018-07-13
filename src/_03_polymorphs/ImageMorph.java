package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImageMorph extends Polymorph {
	private JPanel panel;
	private BufferedImage img;

	ImageMorph(int x, int y, JPanel panel) {
		super(x, y);
		this.panel = panel;
		try {
			img = ImageIO.read(new File("src/doge.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(img, getX(), getY(), panel);
	}

}
