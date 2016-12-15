package lambdasinaction.dsl;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import lambdasinaction.dsl.model.Order;
import lambdasinaction.dsl.model.Stock;
import lambdasinaction.dsl.model.Trade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NestedFunctionOrderBuilderTest {
	@Test
	void testAt_1()
		throws Exception {
		double price = 1.0;

		double result = NestedFunctionOrderBuilder.at(price);

		assertEquals(1.0, result, 0.1);
	}

	@Test
	void testBuy_1()
		throws Exception {
		int quantity = 1;
		Stock stock = new Stock();
		double price = 1.0;

		Trade result = NestedFunctionOrderBuilder.buy(quantity, stock, price);

		assertAll("trades", () -> {
			assertNotNull(result);
			assertEquals(0.0, result.getValue(), 1.0);
			assertEquals(1.0, result.getPrice(), 1.0);
			assertEquals(0, result.getQuantity());
		});
	}

	@Test
	void testOn_1()
		throws Exception {
		String market = "";

		String result = NestedFunctionOrderBuilder.on(market);

		assertEquals("", result);
	}

	@Test
	void testOrder_1()
		throws Exception {
		String customer = "";

		Order result = NestedFunctionOrderBuilder.order(customer);
		
		assertAll("orders", () -> {
			assertNotNull(result);
			assertEquals(0.0, result.getValue(), 1.0);
			assertEquals("", result.getCustomer());
		});
			
	}

	@Test
	void testSell_1()
		throws Exception {
		int quantity = 1;
		Stock stock = new Stock();
		double price = 1.0;

		Trade result = NestedFunctionOrderBuilder.sell(quantity, stock, price);

		assertAll("trades", () -> {
			assertNotNull(result);
			assertEquals(0.0, result.getValue(), 1.0);
			assertEquals(1.0, result.getPrice(), 1.0);
			assertEquals(0, result.getQuantity());
		});
	}

	@Test
	void testStock_1()
		throws Exception {
		String symbol = "";
		String market = "";

		Stock result = NestedFunctionOrderBuilder.stock(symbol, market);

		assertAll("stocks", () -> {
			assertNotNull(result);
			assertEquals("", result.getSymbol());
			assertEquals("", result.getMarket());
		});
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