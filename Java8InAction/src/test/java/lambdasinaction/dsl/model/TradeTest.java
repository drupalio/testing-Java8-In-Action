package lambdasinaction.dsl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("dsl")
@Tag("model")
@RunWith(JUnitPlatform.class)
class TradeTest {
	@Test
	void testGetPrice_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		double result = fixture.getPrice();

		assertEquals(1.0, result, 0.1);
	}

	@Test
	void testGetQuantity_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		int result = fixture.getQuantity();

		assertEquals(1, result);
	}

	@Test
	void testGetStock_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		Stock result = fixture.getStock();

		assertNotNull(result);
		assertEquals(null, result.getSymbol());
		assertEquals(null, result.getMarket());
	}

	@Test
	void testGetType_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		Trade.Type result = fixture.getType();

		assertNotNull(result);
		assertEquals("BUY", result.name());
		assertEquals("BUY", result.toString());
		assertEquals(0, result.ordinal());
	}

	@Test
	void testGetValue_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		double result = fixture.getValue();

		assertEquals(1.0, result, 0.1);
	}

	@Test
	void testSetPrice_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);
		double price = 1.0;

		fixture.setPrice(price);

	}

	@Test
	void testSetQuantity_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);
		int quantity = 1;

		fixture.setQuantity(quantity);

	}

	@Test
	void testSetStock_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);
		Stock stock = new Stock();

		fixture.setStock(stock);

	}

	@Test
	void testSetType_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);
		Trade.Type type = Trade.Type.BUY;

		fixture.setType(type);

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