package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void update() {
		int rng = (int) (Math.random() * 4);
		switch (rng) {
		case 0:
			setX(getX() + 10);
			break;
		case 1:
			setY(getY() + 10);
			break;
		case 2:
			setX(getX() - 10);
			break;
		case 3:
			setY(getY() - 10);
			break;
		}
	}
}
