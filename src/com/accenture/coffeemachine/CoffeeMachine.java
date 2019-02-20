package com.accenture.coffeemachine;

public interface CoffeeMachine {
    public Drink make(DrinkOrder drinkOrder);

    public boolean validateOrder(DrinkOrder validate);

    public String inStock(String ingredients);

    public boolean isBusy() throws InterruptedException;
}