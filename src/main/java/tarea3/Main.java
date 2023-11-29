package tarea3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "yyyy-MM-dd HH-mm";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

		Random random = new Random();
		ArrayList<Flight> flights = new ArrayList<>();
		ArrayList<Reservation> reservations = new ArrayList<>();

		Scanner scanner = new Scanner(System.in); // 2
		int opt = 1;
		while (opt != 0) {
			System.out.println("Welcome to Jose's Airline!");
			System.out.println("Select one of the available options:");
			System.out.println("1) Create Flights:");
			System.out.println("2) Reserve Flight:");
			System.out.println("0) Close:");
			opt = Integer.parseInt(scanner.nextLine());
			if (opt == 1) {
				System.out.println("Where's the flight departing from:");
				String from = scanner.nextLine();
				System.out.println("Where's the flight going to:");
				String to = scanner.nextLine();
				System.out.println("How long does the flight take (in minutes):");
				int minutes = Integer.parseInt(scanner.nextLine());
				System.out.println("How many seats does the flight have available:");
				int available = Integer.parseInt(scanner.nextLine());
				System.out.println("When's the flight departing?");
				System.out.println("Insert value as 'yyyy-MM-dd HH-mm':");
				String dateString = scanner.nextLine();
				LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
				System.out.println("Flight code:");
				String code = scanner.nextLine();
				Flight newflight = new Flight(from, to, minutes, available, dateTime, code);
				flights.add(newflight);
			} else if (opt == 2) {
				System.out.println("Where are you looking to depart from?");
				String from = scanner.nextLine();
				System.out.println("Where are you going?");
				String to = scanner.nextLine();
				for (Flight obj : flights) {
					if (obj.getFrom().equals(from) && obj.getTo().equals(to)) {
						System.out.println(obj.getFlightCode() + "|" + obj.getDate());
					}
				}
				System.out.println("What flight do you want to get seats from?");
				String code = scanner.nextLine();
				System.out.println("How many seats?");
				int seats = Integer.parseInt(scanner.nextLine());
				System.out.println("What's your name?");
				String name = scanner.nextLine();
				for (Flight obj : flights) {
					if (obj.getFlightCode().equals(code)) {
						if (obj.getSeats() < seats) {
							System.out.println("There's not enough seats.");
						} else {
							int randomSixDigit = random.nextInt(900000) + 100000;
							Reservation reserve = new Reservation(name, code, randomSixDigit);
							reservations.add(reserve);
							System.out.println("Reservation " + randomSixDigit + " for " + name + " done.");
							obj.setSeats(obj.getSeats() - seats);
						}
					}
				}
			}
		}

	}

}
