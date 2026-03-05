package week1and2;

import java.util.Scanner;

public class BasicCalculator {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double num1 = input.nextDouble();

    System.out.print("Enter second number: ");
    double num2 = input.nextDouble();

    double add = num1 + num2;
    double sub = num1 - num2;
    double mul = num1 * num2;
    double div = num1 / num2;

    System.out.println("Addition = " + add);
    System.out.println("Subtraction = " + sub);
    System.out.println("Multiplication = " + mul);
    System.out.println("Division = " + div);

    input.close();
}

}