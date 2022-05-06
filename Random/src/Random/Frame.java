package Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JPanel {
	
	public void paint(Graphics g) {
		//paints background, apple, and snake
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(200, 150, 200, 200);
		g.drawRect(200, 150, 200, 200);
		
		int countTotal = 0;
		int countCircle = 0;
		
		for (int i = 0; i < 1234; i++) {
			int x = (int) (Math.random()*201) + 200;
			int y = (int) (Math.random()*201) + 150;
			double xd = (Math.random()*200) + 200;
			double yd = (Math.random()*200) + 150;
			g.fillOval(x, y, 2, 2);
			if ((xd-300)*(xd-300) + (yd-250)*(yd-250) <= 100*100)
				countCircle++;
			countTotal++;
		}
		
		System.out.println(countCircle);
		System.out.println(countTotal);
		
		double pi = (double) countCircle/countTotal * 4.0;
		g.drawString("Pi = " + pi, 500, 250);
		g.drawString(countTotal + " trials", 500, 280);
		System.out.println(pi);
	}
	
	public static void main(String[] args) {
	
		System.out.println("hello world");
		
		Frame frame = new Frame();
	}
	
	public Frame() {
		JFrame f = new JFrame("Pi");
		f.setPreferredSize(new Dimension(800, 600));
	    f.pack();
	    f.setLocationRelativeTo(null);
	    //frame.setVisible(true);
		f.add(this);
		f.setResizable(false);
		//f.setLayout(new GridLayout(1,2));
		//f.addMouseListener(this);
		//f.addKeyListener(this);
		//Timer t = new Timer(40, this);
		//t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);	
	}
		

		

}
