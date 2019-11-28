/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author mkone03
 */
public interface Visitor {
    void visite(Line line);
    void visite(Circle circle);
    void visite(ShapeComposite composite);
}
