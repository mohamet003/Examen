/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Graphics;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mkone03
 */
public class DrawingWithVisitor extends Shape {
    
    private List<Shape> myShapes = new LinkedList<>();
    
    
    public void addShapeTOList(Shape shape){
        myShapes.add(shape);
    }
    
    public void removeShape(Shape shape){
        myShapes.remove(shape);
    }

    @Override
    public void draw(Graphics g) {
        for (Shape myShape : myShapes) {
            myShape.draw(g);
        }
    }

    @Override
    public void translateBy(int dx, int dy) {
              for (Shape myShape : myShapes) {
              myShape.translateBy(dx, dy);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }
    
}
