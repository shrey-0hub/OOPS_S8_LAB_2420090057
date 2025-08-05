package com.klh;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Eventimer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String eventDateTimeStr = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eventDateTime = LocalDateTime.parse(eventDateTimeStr, formatter);
        LocalDateTime now = LocalDateTime.now();

        long days = ChronoUnit.DAYS.between(now, eventDateTime);
        long hours = ChronoUnit.HOURS.between(now.plusDays(days), eventDateTime);
        long minutes = ChronoUnit.MINUTES.between(now.plusDays(days).plusHours(hours), eventDateTime);

        System.out.println("Time remaining until event:");
        System.out.printf("\t\t%d days, %d hours, and %d minutes\n", days, hours, minutes);
	}
}
