/*Create a class called ”TempratureConverter” with the
following methods:
 fahrenheitToCelsious(double fahrenheit) – return
the Celsius equivalent of the given Fahrenheit
temperature.
 CelsiousTofahrenheit (double celcious) – return the
fahrenheit equivalent of the given celcious
temperature. */

import java.util.Scanner;

class TempratureConverter{
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
public class P_14 {
        public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);

        TempratureConverter converter = new TempratureConverter();
        System.out.println("Enter tempratur in ferenheit:");
        double fahrenheit = sc.nextDouble();
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.\n", fahrenheit, celsius);

        System.out.println("Enter tempratur in celsius:");
        celsius = sc.nextDouble();
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.\n", celsius, fahrenheit);

        sc.close();
    }
}

/*
Output::
Purohit Akruti K.
Enter tempratur in ferenheit:
98.6
98.60 Fahrenheit is equal to 37.00 Celsius.
Enter tempratur in celsius:
37.89
37.89 Celsius is equal to 100.20 Fahrenheit.
 */
