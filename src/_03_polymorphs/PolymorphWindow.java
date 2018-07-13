package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	private ArrayList<Polymorph> polys;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		polys = new ArrayList<Polymorph>();
		polys.add(new BluePolymorph(50, 50));
		polys.add(new RedMorph(200, 200));
		polys.add(new MovingMorph(300, 100));
		polys.add(new CircleMorph(200, 200));
		polys.add(new MouseMorph(0, 0));
		polys.add(new ImageMorph(200, 200, this));

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph p : polys)
			p.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

		for (Polymorph p : polys)
			p.update();
	}
}
