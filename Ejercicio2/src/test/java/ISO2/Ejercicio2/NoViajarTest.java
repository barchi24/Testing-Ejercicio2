package ISO2.Ejercicio2;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class NoViajarTest {
	private static Persona p0, p1;
	private static Bus b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p0 = new Persona(20, true, true, true, false, false);
		p1 = new Persona(67, false, false, false, true, true);
		
		b = new Bus(100, 0, 0);
	}

	@Test
	public void testAllCases() {
		assertEquals(-2, PB.precioBillete(p0, b, 30), 0);
		assertEquals(-2, PB.precioBillete(p1, b, 530), 0); // case 4
	}
}