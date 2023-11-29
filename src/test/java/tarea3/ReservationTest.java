package tarea3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReservationTest {

	private Reservation res;

	@Before
	public void setUp() throws Exception {
		res = new Reservation("Jose", "LA200", 123);
	}

	@Test
	public void testGetName() {
		Assert.assertTrue(res.getName().equals("Jose"));
	}

	@Test
	public void testGetCode() {
		Assert.assertTrue(res.getCode().equals("LA200"));
	}

	@Test
	public void testGetReservation() {
		Assert.assertTrue(res.getReservation() == 123);
	}

}
