package shapes;

/**
 * A Segement of a line, that extends between two points
 * @author Rémi Bastide
 * @version 1.0
 */

import java.awt.Graphics;
import java.awt.Point;

public class Line
	extends Shape {
	private final Point myStart;
	private final Point myEnd;


	/**
	 * Construct a line
	 * @param start The starting point
	 * @param end   The end point
	 **/
	public Line(Point start, Point end) {
		myStart = start;
		myEnd = end;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(myStart.x, myStart.y, myEnd.x, myEnd.y);
	}

	@Override
	public void translateBy(int dx, int dy) {
		myStart.translate(dx, dy);
		myEnd.translate(dx, dy);
	}

	public Point getStart() {
		return myStart;
	}

	public Point getEnd() {
		return myEnd;
	}

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }
}
