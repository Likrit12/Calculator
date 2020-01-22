package main.java;

import java.util.Scanner;

public class WorkCalc {
    private static final Calculator CALC = new Calculator();
    public void ProcessWork() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение A: ");
        int firstNumber = in.nextInt();
        System.out.print("Введите значение B: ");
        int secondNumber = in.nextInt();
        in.nextLine();
        System.out.println("Выберите операцию: + | - | * | /");
        String action = in.nextLine();
        switch (action){
            case ("+"):
                System.out.println(CALC.plus(firstNumber,secondNumber));
                break;
            case ("-"):
                System.out.println(CALC.minus(firstNumber,secondNumber));
                break;
            case ("*"):
                System.out.println(CALC.multiply(firstNumber,secondNumber));
                break;
            case ("/"):
                System.out.println(CALC.del(firstNumber,secondNumber));
                break;
        }

    }
}
