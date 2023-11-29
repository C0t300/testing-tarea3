package tarea3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlightTest {

	private Flight flight;

	@Before
	public void setUp() throws Exception {
		String dateString = "2023-11-28 12-34";
		String pattern = "yyyy-MM-dd HH-mm";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		flight = new Flight("SCL", "JFK", 500, 15, LocalDateTime.parse(dateString, formatter), "LA111");
	}

	/*
	 * @Test public void testFlight() { throw new
	 * RuntimeException("not yet implemented"); }
	 */
	@Test
	public void testGetFrom() {
		Assert.assertTrue(flight.getFrom().equals("SCL"));
	}

	@Test
	public void testGetTo() {
		Assert.assertTrue(flight.getTo().equals("JFK"));
	}

	@Test
	public void testGetMinutes() {
		Assert.assertTrue(flight.getMinutes() == 500);
	}

	@Test
	public void testGetSeats() {
		Assert.assertTrue(flight.getSeats() == 15);
	}

}
