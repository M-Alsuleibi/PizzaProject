/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author user
 */
public class PizzaDough extends Mixer {
    public PizzaDough() {
    }

    public PizzaDough(String panSize, String name, int weight, int calories) {
        super(panSize, name, weight, calories);
    }

    @Override
    public String getinfo() {
        return super.getinfo();
    }


    public void makeDough() throws InterruptedException {

        System.out.println("Dough is being made.....");
        Thread.sleep(2000);
        System.out.println("Ready!!");

    }
}
