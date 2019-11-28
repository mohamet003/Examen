package shapes;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JApplet;

public class DrawingApplet extends JApplet {
	private Drawing myDrawing = new Drawing();

	@Override
	public void init() {
		super.init();
		// Initialiser le dessin
		myDrawing.addShape(
			new Circle(
				new Point(30,30), //center
				10 // radius
			)
		);
		Line line = new Line(
			new Point(30,30),
			new Point(45,45)
		);
		line.translateBy(25, 35);
		myDrawing.addShape(line);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g); 
		// Dessiner le dessin
		myDrawing.draw(g);
	}	
}
