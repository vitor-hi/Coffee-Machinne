package org.example.model;

import org.example.view.CoffeeMachineView;

public class SupplyWorker {

    private static CoffeeMachine model;
    private static CoffeeMachineView view;

    public static void SupplyMachine(CoffeeMachine model, CoffeeMachineView view) {
        view.ShowMessage("How many ml of water you want to add ?: \n");
        model.setWater(model.getWater() + view.getUserInput(view));
        view.ShowMessage("How many ml of milk you want to add ?: \n");
        model.setMilk(model.getMilk() + view.getUserInput(view));
        view.ShowMessage("How many grams of coffee beans you want to add ?: \n");
        model.setCoffeeBeans(model.getCoffeeBeans() + view.getUserInput(view));
        view.ShowMessage("How many disposable cups you want to add ?: \n");
        model.setCups(model.getCups() + view.getUserInput(view));
    }
}
