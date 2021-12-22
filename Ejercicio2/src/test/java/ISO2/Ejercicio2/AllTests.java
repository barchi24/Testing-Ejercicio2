package ISO2.Ejercicio2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AforoCompletoTest.class, Entre23Y60Test.class, Mayor65ImprescindibleTest.class,
		Menor23NoImprescindibleTest.class, NoViajarTest.class, NumeroNegativoTest.class })
public class AllTests {
}