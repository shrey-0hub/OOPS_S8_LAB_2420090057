package com.klh;
import java.util.Scanner;
public class fhtocel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double temperatureFahrenheit = scanner.nextDouble();

        double temperatureCelsius = (5.0 / 9.0) * (temperatureFahrenheit - 32);

        System.out.println("Converted temperature: " + temperatureCelsius + " C");

        scanner.close();
	}

}
