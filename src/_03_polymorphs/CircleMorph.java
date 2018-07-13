package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	private int radius;
	private double angle;
	private final int startX, startY;

	CircleMorph(int x, int y) {
		super(x, y);
		radius = 100;
		angle = 0;
		startX = x;
		startY = y;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void update() {
		angle += 0.1;
		setX((int) (Math.cos(angle) * radius) + startX);
		setY((int) (Math.sin(angle) * radius) + startY);
	}

}
