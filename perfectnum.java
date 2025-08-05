package com.klh;
import java.util.Scanner;
public class perfectnum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int number = scanner.nextInt();
	        int sumOfDivisors = 1;

	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                sumOfDivisors += i;
	                if (i * i != number) {
	                    sumOfDivisors += number / i;
	                }
	            }
	        }

	        if (number > 1 && sumOfDivisors == number) {
	            System.out.println(number + " is a perfect number");
	        } else {
	            System.out.println(number + " is not a perfect number");
	        }

	        scanner.close();
	    }
	}







