/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example;

/**
 *
 * @author MAHITAB
 */
public class PizzaSlices extends PizzaPan{

    public PizzaSlices() {
    }

    public PizzaSlices(String panSize, String name, int weight, int calories) {
        super(panSize, name, weight, calories);
    }

    @Override
    public String getinfo() {
        return super.getinfo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
