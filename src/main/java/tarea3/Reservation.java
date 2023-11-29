package tarea3;

public class Reservation {

	private String name;
	private String code;
	private int reservation;

	public Reservation(String name, String code, int reservation) {
		super();
		this.name = name;
		this.code = code;
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getReservation() {
		return reservation;
	}

	public void setReservation(int reservation) {
		this.reservation = reservation;
	}

}
