package lambdasinaction.dsl;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.function.Consumer;

import lambdasinaction.dsl.model.Order;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaOrderBuilderTest {
	@Test
	void testLambdaOrderBuilder_1()
		throws Exception {
		LambdaOrderBuilder result = new LambdaOrderBuilder();
		assertNotNull(result);
	}

	@Test
	void testBuy_1()
		throws Exception {
		LambdaOrderBuilder fixture = new LambdaOrderBuilder();
		Consumer<LambdaOrderBuilder.TradeBuilder> consumer = mock(Consumer.class);
		// add mock object expectations here


		fixture.buy(consumer);

	}

	@Test
	void testForCustomer_1()
		throws Exception {
		LambdaOrderBuilder fixture = new LambdaOrderBuilder();
		String customer = "";

		fixture.forCustomer(customer);

	}

	@Test
	void testOrder_1()
		throws Exception {
		Consumer<LambdaOrderBuilder> consumer = mock(Consumer.class);
		// add mock object expectations here


		Order result = LambdaOrderBuilder.order(consumer);

		assertAll("order", () -> {
			assertNotNull(result);
			assertEquals(0.0, result.getValue(), 1.0);
			assertEquals(null, result.getCustomer());
		});
	}

	@Test
	void testSell_1()
		throws Exception {
		LambdaOrderBuilder fixture = new LambdaOrderBuilder();
		Consumer<LambdaOrderBuilder.TradeBuilder> consumer = mock(Consumer.class);
		// add mock object expectations here


		fixture.sell(consumer);

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