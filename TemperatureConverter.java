# Temperature-Converter
Java program to convert temperature between Celsius, Fahrenheit and Kelvin --
  import java.io.*;
  import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");

        System.out.print("Choose an option (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = (temp * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + result);
                break;

            case 2:
                result = (temp - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + result);
                break;

            case 3:
                result = temp + 273.15;
                System.out.println("Temperature in Kelvin: " + result);
                break;

            case 4:
                result = temp - 273.15;
                System.out.println("Temperature in Celsius: " + result);
                break;

            case 5:
                result = (temp - 32) * 5 / 9 + 273.15;
                System.out.println("Temperature in Kelvin: " + result);
                break;

            case 6:
                result = (temp - 273.15) * 9 / 5 + 32;
                System.out.println("Temperature in Fahrenheit: " + result);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}


