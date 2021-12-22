package ISO2.Ejercicio2;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class Menor23NoImprescindibleTest {
	private static Persona p;
	private static Bus b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Persona(20, false, false, false, true, false);
		b = new Bus(100, 0, 0);
	}

	@Test
	public void testAllCasesNoExceptions() {
		assertEquals(4, PB.precioBillete(p, b, 30), 0); // case 0

		assertEquals(7, PB.precioBillete(p, b, 150), 0); // case 1

		assertEquals(10, PB.precioBillete(p, b, 210), 0); // case 2

		assertEquals(12, PB.precioBillete(p, b, 320), 0); // case 3

		assertEquals(15, PB.precioBillete(p, b, 530), 0); // case 4
	}
}