/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author user
 */
public class PizzaPan extends Pizza {
    private String panSize;
    private String name;
    private int weight;
    private int calories;

    public PizzaPan() {
    }

    public PizzaPan(String panSize, String name, int weight, int calories) {
        this.panSize = panSize;
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    static void bake(){
    }

    PizzaPan(String pan, int w, int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getSize() {
        return panSize;
    }

    public void setSize(String size) {
        this.panSize = size;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }



    public String getinfo() {
        return "\n name:"+name + "\n weight :"+weight +"\n calories" +calories;
    }
}
