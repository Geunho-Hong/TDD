package calculator;

import java.util.Scanner;

public class MainController {

    private static Scanner sc = new Scanner(System.in);
    private static Calculator calculator;
    private static int curentValue = 0;
    private static int value = 0;

    public static void main(String[] args) {

        System.out.println("Hello TDD Calculator World");
        System.out.println("Do you want to set Default Value?");
        System.out.println("1: Yes , 2: No ");

        int command = sc.nextInt();
        int defaultValue = 0;

        if(command == 1){
            System.out.println("Please write initial value");
            defaultValue = sc.nextInt();
            calculator = new Calculator(defaultValue);
        }
        else if(command == 2){
            System.out.println("Default value is Zero");
            calculator = new Calculator();
        }
        sc.nextLine(); // Reset Line

        System.out.println("Default value is " + defaultValue);
        System.out.println("If you want finish program, please write End");

        while(true){
            System.out.println("Select '+' , '-' , '/' , '*' , 'R',F");
            char operation = sc.next().charAt(0);

            if(operation == 'F'){
                System.out.println("Finish Program");
                break;
            }

            switch (operation){
                case '+':
                    System.out.println("Please write value");
                    value = sc.nextInt();
                    calculator.add(value);
                    curentValue = calculator.getInitalValue();
                    System.out.println("Current Value is " + curentValue);
                    break;
                case '-':
                    System.out.println("Please write value");
                    value = sc.nextInt();
                    calculator.minus(value);
                    curentValue = calculator.getInitalValue();
                    System.out.println("Current Value is " + curentValue);
                    break;
                case '*' :
                    System.out.println("Please write value");
                    value = sc.nextInt();
                    calculator.multiply(value);
                    curentValue = calculator.getInitalValue();
                    System.out.println("Current Value is " + curentValue);
                    break;
                case '/' :
                    System.out.println("Please write value");
                    value = sc.nextInt();
                    calculator.divide(value);
                    curentValue = calculator.getInitalValue();
                    System.out.println("Current Value is " + curentValue);
                    break;
                case 'R' :
                    System.out.println("Reset Value");
                    calculator.clearValue();
                    break;
                default :
                    System.out.println("Not permitted Operation");

            }
        }

    }
}
