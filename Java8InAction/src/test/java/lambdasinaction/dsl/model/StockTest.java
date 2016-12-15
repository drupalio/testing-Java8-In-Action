package lambdasinaction.dsl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockTest {
	@Test
	void testGetMarket_1()
		throws Exception {
		Stock fixture = new Stock();
		fixture.setSymbol("");
		fixture.setMarket("");

		String result = fixture.getMarket();

		assertEquals("", result);
	}

	@Test
	void testGetSymbol_1()
		throws Exception {
		Stock fixture = new Stock();
		fixture.setSymbol("");
		fixture.setMarket("");

		String result = fixture.getSymbol();

		assertEquals("", result);
	}

	@Test
	void testSetMarket_1()
		throws Exception {
		Stock fixture = new Stock();
		fixture.setSymbol("");
		fixture.setMarket("");
		String market = "";

		fixture.setMarket(market);

	}

	@Test
	void testSetSymbol_1()
		throws Exception {
		Stock fixture = new Stock();
		fixture.setSymbol("");
		fixture.setMarket("");
		String symbol = "";

		fixture.setSymbol(symbol);

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