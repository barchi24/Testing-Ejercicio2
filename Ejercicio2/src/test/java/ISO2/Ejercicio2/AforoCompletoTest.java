package ISO2.Ejercicio2;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class AforoCompletoTest {
	private static Persona p;
	private static Bus b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Persona(30, false, false, false, true, false);
		b = new Bus(20, 10, 20);
	}

	@Test
	public void testAllCases() {
		assertEquals(-3, PB.precioBillete(p, b, 30), 0); // case 0
		assertEquals(-3, PB.precioBillete(p, b, 150), 0); // case 1
		assertEquals(-3, PB.precioBillete(p, b, 210), 0); // case 2
		assertEquals(-3, PB.precioBillete(p, b, 320), 0); // case 3
		assertEquals(-3, PB.precioBillete(p, b, 530), 0); // case 4
	}
}