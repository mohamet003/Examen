package shapes;

import java.awt.Graphics;
import java.awt.Point;

/**
 * A circle
 **/

public class Circle
	extends Shape {
	private final Point myCenter;
	private final int myRadius;

	/**
	 * Construct a Circle
	 * @param center        The center of the circle
	 * @param radius        The radius of the circle
	 **/
	public Circle(Point center, int radius) {
		myCenter = center;
		myRadius = radius;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(myCenter.x - myRadius,
			   myCenter.y - myRadius,
			   myRadius * 2,
			   myRadius * 2
			);
	}

	@Override
	public void translateBy(int dx, int dy) {
		myCenter.translate(dx, dy);
	}

	public Point getCenter() {
		return myCenter;
	}

	public int getRadius() {
		return myRadius;
	}

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }
	
}