package org.example.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeMachineTools implements CoffeeMachineView{

    Scanner sc = new Scanner(System.in);
    @Override
    public void ShowMessage(String message) {
        System.out.println(message);
    }

    @Override
    public int getUserInput(CoffeeMachineView view) {
        while (true) {
            try {
                return sc.nextInt();
            }catch (InputMismatchException e) {
                view.ShowMessage("Invalid input. Enter a number: ");
                sc.next();

            }
        }
    }
}
