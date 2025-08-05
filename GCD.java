package com.klh;
import java.util.Scanner;
public class GCD {
	public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("The GCD is: " + gcd);

        scanner.close();
    }
}
