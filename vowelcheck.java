package com.klh;
import java.util.Scanner;
public class vowelcheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        char ch = Character.toLowerCase(scanner.next().charAt(0));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }

        scanner.close();
	}

}
