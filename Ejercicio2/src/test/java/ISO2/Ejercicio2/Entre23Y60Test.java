package ISO2.Ejercicio2;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class Entre23Y60Test {
	private static Persona p;
	private static Bus b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Persona(30, false, false, false, true, false);
		b = new Bus(100, 0, 0);
	}

	@Test
	public void testAllCasesNoExceptions() {
		assertEquals(10, PB.precioBillete(p, b, 30), 0); // case 0

		assertEquals(10, PB.precioBillete(p, b, 150), 0); // case 1

		// case 2 no es necesario

		assertEquals(10, PB.precioBillete(p, b, 320), 0); // case 3

		assertEquals(10, PB.precioBillete(p, b, 530), 0); // case 4
	}
}