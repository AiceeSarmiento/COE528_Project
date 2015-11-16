/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circletest;

/**
 *
 * @author AiceeCarlSarmiento
 */
public class CircleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle();
        c.radius = 6;
        System.out.println(c.radius);
        c.dump();
    }
    
}
