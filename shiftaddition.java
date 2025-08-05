package com.klh;
import java.util.Scanner;
public class shiftaddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ms: ");
        double ms = scanner.nextDouble();
        System.out.print("Enter es: ");
        double es = scanner.nextDouble();

        double total = ms + es;

        System.out.println("Total amount earned in a day: " + total );

        scanner.close();
	}

}
