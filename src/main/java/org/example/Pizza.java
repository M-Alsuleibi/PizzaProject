package org.example;

public abstract class Pizza {
    private static int calories_amount ;

    public Pizza() {
    }

    public static int get_calories_amount() {
        return calories_amount;
    }

    public static void set_calories_amount(int calories_amount) {
        Pizza.calories_amount = calories_amount;
    }

}
