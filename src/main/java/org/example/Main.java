package org.example;

import org.example.controller.CoffeeMachineAction;
import org.example.model.CoffeeMachine;
import org.example.view.CoffeMachineTools;
import org.example.view.CoffeeMachineView;


public class Main {
    public static void main(String[] args) {

        CoffeeMachine model = new CoffeeMachine();
        CoffeeMachineView view = new CoffeMachineTools();
        CoffeeMachineAction action = new CoffeeMachineAction(model, view);
        action.start();

    }
}
