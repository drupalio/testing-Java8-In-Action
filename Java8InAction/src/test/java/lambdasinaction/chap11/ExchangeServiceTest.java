package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExchangeServiceTest {
	@Test
	void testGetRate_1()
		throws Exception {
		ExchangeService.Money source = ExchangeService.Money.CAD;
		ExchangeService.Money destination = ExchangeService.Money.CAD;

		double result = ExchangeService.getRate(source, destination);

		assertEquals(1.0, result, 0.1);
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