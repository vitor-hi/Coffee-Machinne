package org.example.model;



public class CoffeeMachine implements CoffeeMachineModel {

    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    protected int cash = 550;

    @Override
    public int getWater() {
        return this.water;
    }

    @Override
    public void setWater(int water) {
        this.water = water;

    }

    @Override
    public int getMilk() {
        return this.milk;
    }

    @Override
    public void setMilk(int milk) {
        this.milk = milk;

    }

    @Override
    public int getCoffeeBeans() {
        return this.coffeeBeans;
    }

    @Override
    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;

    }

    @Override
    public int getCups() {
        return this.cups;
    }

    @Override
    public void setCups(int cups) {
        this.cups = cups;

    }

    @Override
    public int getCash() {
        return this.cash;
    }

    @Override
    public void setCash(int cash){
        this.cash = cash;

    }

    @Override
    public String toString() {
        return "The coffe machine has: \n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + "g of coffee beans\n" +
                cups + " disposible cups\n" +
                "$" + cash + " of money";
    }
}








