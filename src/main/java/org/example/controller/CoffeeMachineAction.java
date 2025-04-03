package org.example.controller;

import org.example.model.*;
import org.example.view.CoffeeMachineView;
import java.util.InputMismatchException;

public class CoffeeMachineAction implements CoffeeMachineController {

    private CoffeeMachine model;
    private CoffeeMachineView view;

    public CoffeeMachineAction(CoffeeMachine model, CoffeeMachineView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void start() {

        int count = 0;
        int op = 1;
        while (op != 0) {
            if (count < 10) {

                view.ShowMessage("Action: 1 - buy, 2 - fill, 3 - take, 4 - clean, 5 - remaining, 0 - exit: ");

                op = view.getUserInput(view);


                switch (op) {
                    case 1:
                        view.ShowMessage("What do you want to buy? 1 - cappuccino, 2 - latte, 3 - espresso: ");

                        op = view.getUserInput(view);


                        switch (op) {
                            case 1:
                                Cappuccino cappuccino = new Cappuccino();
                                model.setWater(model.getWater() - cappuccino.getWater());
                                model.setMilk(model.getMilk() - cappuccino.getMilk());
                                model.setCoffeeBeans(model.getCoffeeBeans() - cappuccino.getCoffeeBeans());
                                model.setCups(model.getCups() - 1);
                                model.setCash(model.getCash() + cappuccino.getPrice());
                                count++;
                                break;
                            case 2:
                                Latte latte = new Latte();
                                model.setWater(model.getWater() - latte.getWater());
                                model.setMilk(model.getMilk() - latte.getMilk());
                                model.setCoffeeBeans(model.getCoffeeBeans() - latte.getCoffeeBeans());
                                model.setCash(model.getCash() + latte.getPrice());
                                model.setCups(model.getCups() - 1);
                                count++;
                                break;
                            case 3:
                                Espresso espresso = new Espresso();
                                model.setWater(model.getWater() - espresso.getWater());
                                model.setCash(model.getCash() + espresso.getPrice());
                                model.setCoffeeBeans(model.getCoffeeBeans() - espresso.getCoffeeBeans());
                                model.setCups(model.getCups() - 1);
                                count++;
                        }
                        break;
                    case 2:
                        SupplyWorker.SupplyMachine(model, view);

                        break;
                    case 3:
                            MoneyWorker.CollectMoney(model);
                        break;
                    case 4:
                            count = 0;
                            view.ShowMessage("Coffee Machine has been cleaned!");
                            break;
                    case 5:
                        view.ShowMessage(model.toString());
                        break;
                    case 0:
                        break;


                }
            } else {
                int cleanup = 0;
                while(cleanup != 4) {
                    view.ShowMessage("10 coffees made. Time to clean up. Press 4.");
                    cleanup = view.getUserInput(view);
                }
                count = 0;
                view.ShowMessage("Coffee Machine has been cleaned!");
            }

        }
    }
}


