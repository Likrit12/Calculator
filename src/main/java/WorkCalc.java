package main.java;

import java.util.Scanner;

public class WorkCalc {
    public void ProcessWork() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение A: ");
        int firstNumber = in.nextInt();
        System.out.print("Введите значение B: ");
        int secondNumber = in.nextInt();
        in.nextLine();
        System.out.println("Выберите операцию: + | - | * | /");
        String action = in.nextLine();
        for (Calculator calc : Calculator.values()) {
            if (calc.toString().equals(action)){
                System.out.println(calc.apply(firstNumber,secondNumber));
            }
        }


    }

}
