package ISO2.Ejercicio2;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class Mayor65ImprescindibleTest {
	private static Persona p;
	private static Bus b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Persona(67, false, false, false, true, true);
		b = new Bus(100, 0, 0);
	}

	@Test
	public void testAllCasesNoExceptions() {
		assertEquals(2, PB.precioBillete(p, b, 30), 0); // case 0

		assertEquals(5, PB.precioBillete(p, b, 150), 0); // case 1

		assertEquals(12, PB.precioBillete(p, b, 210), 0); // case 2

		assertEquals(15, PB.precioBillete(p, b, 320), 0); // case 3

		// caso 4 saltaría excepción
	}
}