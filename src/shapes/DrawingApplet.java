package shapes;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JApplet;

public class DrawingApplet extends JApplet {
	private Drawing myDrawing = new Drawing();
        private DrawingWithVisitor shapeComposite = new DrawingWithVisitor();
        private DrawingWithVisitor shapeComposite2 = new DrawingWithVisitor();
        

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
                
                // Test avec le composite
                shapeComposite.addShapeTOList(
			new Circle(
				new Point(40,40),
				10
			)
		);
		Line line2 = new Line(
			new Point(30,35),
			new Point(45,50)
		);
		line2.translateBy(25, 35);
		shapeComposite.addShapeTOList(line2);
                
                shapeComposite2.addShapeTOList(
			new Circle(
				new Point(140,140),
				10
			)
		);
		Line line3 = new Line(
			new Point(60,65),
			new Point(75,80)
		);
		line3.translateBy(30, 40);
		shapeComposite2.addShapeTOList(line3);
                
                //Ajout du groupe de forme shapeComposite2 dans un autre groupe de forme shapeComposite grace à composite
                shapeComposite.addShapeTOList(shapeComposite2);
                
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
                VisitorImplementation visitorImplementation = new VisitorImplementation(g);
                visitorImplementation.visite(shapeComposite);
	}	
}
