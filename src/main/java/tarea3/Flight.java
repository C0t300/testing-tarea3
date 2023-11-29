package tarea3;

import java.time.LocalDateTime;

public class Flight {

	private String from;
	private String to;
	private int minutes;
	private int seats;
	private LocalDateTime date;
	private String flightCode;

	public Flight(String from, String to, int minutes, int seats, LocalDateTime date, String flightCode) {
		super();
		this.from = from;
		this.to = to;
		this.minutes = minutes;
		this.seats = seats;
		this.date = date;
		this.flightCode = flightCode;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

}
