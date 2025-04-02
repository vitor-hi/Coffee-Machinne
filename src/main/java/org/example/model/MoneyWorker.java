package org.example.model;

public class MoneyWorker {

    private int totalCash = 0;

    public static void CollectMoney(CoffeeMachine modal) {
        int totalCash =+ modal.getCash();
        modal.setCash(0);
    }

    public int getTotalCash() {
        return totalCash;
    }
}
