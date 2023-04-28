/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factory;

/**
 *
 * @author João Vitor
 */
public class Factory {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("Circle");
        
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("Square");
        
        shape2.draw();
    }
}
