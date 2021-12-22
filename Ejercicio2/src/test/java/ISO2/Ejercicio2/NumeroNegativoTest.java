package ISO2.Ejercicio2;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumeroNegativoTest {
	private static Persona p;
	private static Bus b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Persona(-5, true, true, true, false, false);
		b = new Bus(-12, -28, -33);
	}

	@Test
	public void testAllCases() {
		assertEquals(-1, PB.precioBillete(p, b, -3), 0);
	}
}