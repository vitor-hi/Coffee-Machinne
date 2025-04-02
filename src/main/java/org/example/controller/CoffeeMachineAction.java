package org.example.controller;

import org.example.model.*;
import org.example.view.CoffeeMachineView;

import java.util.InputMismatchException;
import java.util.Scanner;

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
                System.out.println(model.toString());
                view.ShowMessage("Action: 1 - buy, 2 - fill, 3 - take, 0 - exit");
                try {
                    op = view.getUserInput();
                } catch (InputMismatchException e) {
                    view.ShowMessage("Invalid input. Enter a number\n");
                    op = view.getUserInput();
                    op = -1;
                }

                switch (op) {
                    case 1:
                        view.ShowMessage("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                        try {
                            op = view.getUserInput();
                        } catch (InputMismatchException e) {
                            view.ShowMessage("Invalid input. Enter a number\n");

                        }

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
                                model.setCups(model.getCups() - 1);
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

                    case 0:
                        break;


                }
            } else {
                System.out.println("Type clean to clean machine");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                count = 0;
            }

        }
    }
}


