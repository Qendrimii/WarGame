import java.awt.*;
import javax.swing.*;
import java.util.*;

public class WarGameView extends JPanel {

	JFrame frame = new JFrame();
	public int x = 500;
	public int y = 500;
	public int z = 50;
	public int b = 0;

	public WarGameMain wm = new WarGameMain();
	public String fituesi = "";

	/*
	 * Konstruktoi WarGameView - krijon kornien
	 */
	public WarGameView() {
		frame.setSize(x, y);
		frame.getContentPane().add(this);
		frame.setTitle("WarGame");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// nese shypim X te
																// nderprej
																// programin
	}

	/*
	 * Vizatojme ne kornize
	 */
	public void paintComponent(Graphics g) {
		repaint();
		// ngyrosim kornizen
		g.setColor(Color.white);
		g.fillRect(0, 0, x, y);

		// "Krijojme" letrat ne kornize
		g.setColor(Color.lightGray);
		g.fillRect(10, 10, z * 3, z * 4);
		g.fillRect(z * 6, 10, z * 3, z * 4);

		g.setColor(Color.darkGray);
		g.drawString(wm.player1(), z, z);
		g.drawString(wm.player2(), z * 7, z);

		g.setColor(Color.red);
		g.drawString("Player 1:" + wm.emri1(), z, z * 5);
		g.drawString("Numri i fitoreve : " + wm.numriFitoreveP1(), z, z * 6);

		g.drawString("Player 2:" + wm.emri2(), z * 7, z * 5);
		g.drawString("Numri i fitoreve : " + wm.numriFitoreveP2(), z * 7, z * 6);

		g.setColor(Color.blue);
		g.drawString("Barazimet: " + wm.numriBarazimeve(), z * 4, z * 5);
	

		if (wm.numriFitoreveP1() == wm.numriFitoreveP2()) {
			fituesi = "Barazim";
		
		} else {
			fituesi = wm.fituesi();
		}

		g.setColor(Color.green);
		if (wm.fituesi() == "Barazim") {
			g.setColor(Color.blue);
			
		}
		g.drawString(wm.fituesi(), z * 4, z * 7);

		if (wm.numriBarazimeve()+wm.numriFitoreveP1()+wm.numriFitoreveP2()>=25) {
			g.setColor(Color.black);
			g.fillRect(z * 2, z * 6, z * 7, z);
			g.setColor(Color.white);
			g.drawString("Ska me letra , " + wm.fituesi(), 130, 330);
		}

	}
}