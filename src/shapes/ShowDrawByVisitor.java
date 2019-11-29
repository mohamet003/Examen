/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Graphics;

/**
 *
 * @author mkone03
 */
public class ShowDrawByVisitor implements Visitor{
    
    private Graphics g;

    public ShowDrawByVisitor(Graphics g) {
        this.g = g;
    }

    @Override
    public void visite(Line line) {
        line.draw(g);
    }

    @Override
    public void visite(Circle circle) {
        circle.draw(g);
    }

    @Override
    public void visite(ShapeComposite composite) {
        composite.draw(g);
    }
    
}
