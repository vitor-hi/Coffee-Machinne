package org.example.view;

import java.util.Scanner;

public class CoffeMachineTools implements CoffeeMachineView{

    Scanner sc = new Scanner(System.in);
    @Override
    public void ShowMessage(String message) {
        System.out.println(message);
    }

    @Override
    public int getUserInput() {
        return sc.nextInt();
    }
}
