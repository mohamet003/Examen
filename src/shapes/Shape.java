package shapes;

/**
 * The Shape abstract class, super-class of all Shapes
 * @author Rémi Bastide
 * @version 1.0
 */
import java.awt.Graphics;

public abstract class Shape {

	/**
	 * Draws this shape in a graphics context
	 * @param g the graphics to draw into
	 */
	abstract public void draw(Graphics g);

	/**
	 * Translates this shape
	 * @param dx delta x
	 * @param dy delta y
	 */
	abstract public void translateBy(int dx, int dy);
        
        public abstract void accept(Visitor visitor);

}
