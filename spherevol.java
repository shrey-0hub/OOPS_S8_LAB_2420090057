package com.klh;
import java.util.Scanner;
public class spherevol {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        double radius = scanner.nextDouble();

	        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

	        System.out.println("Volume: " + volume);

	        scanner.close();
	}

}
