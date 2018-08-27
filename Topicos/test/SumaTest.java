import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	@Test
	public void SumaEntero() {
		Calculadora2 calcu = new Calculadora2();
		 int esperado= 4;
		assertEquals (esperado, calcu.suma(2,2));
	}

}
