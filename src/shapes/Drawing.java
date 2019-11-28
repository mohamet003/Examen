package shapes;

/**
 * Drawing, a collection of Shapes
 * @author Rémi Bastide
 * @version 1.0
 * @see simpledraw.Shape
 */

import java.util.*;

import java.awt.Graphics;

public class Drawing {
	/**
	 * A drawing is a collection of shapes
	 */
	private List<Shape> myShapes = new LinkedList<>();

	public Drawing() {
	}

	/**
	 * Displays the drawing
	 * @param g     The Graphics to display on
	 **/
	public void draw(Graphics g) {
		for(Shape s : myShapes)
			s.draw(g);
	}

	/**
	 * Add a shape to the Drawing
	 * @param s     The Shape to add
	 **/
	public void addShape(Shape s) {
		myShapes.add(s);
	}

	/**
	 * Delete a shape from the Drawing
	 * @param s     The Shape to delete
	 **/
	public void deleteShape(Shape s) {
		myShapes.remove(s);
	}

}
