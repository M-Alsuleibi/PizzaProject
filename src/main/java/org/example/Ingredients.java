/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author user
 */
 public class Ingredients extends PizzaPan {
    private String name ;
    private int weight;
    private int amountOfCalories;

    public Ingredients() {
    }

    public Ingredients(String name, int weight, int amountOfCalories) {
        this.name = name;
        this.weight = weight;
        this.amountOfCalories = amountOfCalories;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAmountOfCalories() {
        return amountOfCalories;
    }

    public void setAmountOfCalories(int amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }
}
