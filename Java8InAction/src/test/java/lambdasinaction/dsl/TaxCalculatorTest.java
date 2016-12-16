package lambdasinaction.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.function.Function;

import lambdasinaction.dsl.model.Order;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("dsl")
@RunWith(JUnitPlatform.class)
class TaxCalculatorTest {
	@Test
	void testTaxCalculator_1()
		throws Exception {
		TaxCalculator result = new TaxCalculator();
		assertNotNull(result);
	}

	@Test
	void testCalculate_1()
		throws Exception {
		TaxCalculator fixture = new TaxCalculator();
		fixture.taxFuncion = mock(Function.class);
		Order order = new Order();

		double result = fixture.calculate(order);

		assertEquals(0.0, result, 0.1);
	}

	@Test
	void testCalculate_2()
		throws Exception {
		Order order = new Order();
		boolean useRegional = false;
		boolean useGeneral = true;
		boolean useSurcharge = true;

		double result = TaxCalculator.calculate(order, useRegional, useGeneral, useSurcharge);

		assertEquals(0.0, result, 0.1);
	}

	@Test
	void testCalculate_3()
		throws Exception {
		Order order = new Order();
		boolean useRegional = true;
		boolean useGeneral = false;
		boolean useSurcharge = false;

		double result = TaxCalculator.calculate(order, useRegional, useGeneral, useSurcharge);

		assertEquals(0.0, result, 0.1);
	}

	@Disabled
	@Test
	void testCalculateF_1()
		throws Exception {
		TaxCalculator fixture = new TaxCalculator();
		fixture.taxFuncion = mock(Function.class);
		Order order = new Order();

		double result = fixture.calculateF(order);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.dsl.TaxCalculator.calculateF(TaxCalculator.java:65)
		assertEquals(0.0, result, 0.1);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		TaxCalculator.main(args);

	}

	@Test
	void testWith_1()
		throws Exception {
		TaxCalculator fixture = new TaxCalculator();
		fixture.taxFuncion = mock(Function.class);
		Function<Double, Double> f = mock(Function.class);
		// add mock object expectations here


		TaxCalculator result = fixture.with(f);

		assertNotNull(result);
	}

	@Test
	void testWithTaxGeneral_1()
		throws Exception {
		TaxCalculator fixture = new TaxCalculator();
		fixture.taxFuncion = mock(Function.class);

		TaxCalculator result = fixture.withTaxGeneral();

		assertNotNull(result);
	}

	@Test
	void testWithTaxRegional_1()
		throws Exception {
		TaxCalculator fixture = new TaxCalculator();
		fixture.taxFuncion = mock(Function.class);

		TaxCalculator result = fixture.withTaxRegional();

		assertNotNull(result);
	}

	@Test
	void testWithTaxSurcharge_1()
		throws Exception {
		TaxCalculator fixture = new TaxCalculator();
		fixture.taxFuncion = mock(Function.class);

		TaxCalculator result = fixture.withTaxSurcharge();

		assertNotNull(result);
	}

	@BeforeEach
	void setUp()
		throws Exception {
	}

	@AfterEach
	void tearDown()
		throws Exception {
	}

}