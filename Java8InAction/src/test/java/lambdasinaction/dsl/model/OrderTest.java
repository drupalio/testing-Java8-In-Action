package lambdasinaction.dsl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTest {
	@Test
	void testOrder_1()
		throws Exception {
		Order result = new Order();
		assertNotNull(result);
	}

	@Test
	void testAddTrade_1()
		throws Exception {
		Order fixture = new Order();
		fixture.setCustomer("");
		fixture.addTrade(new Trade());
		Trade trade = new Trade();

		fixture.addTrade(trade);

	}

	@Test
	void testGetCustomer_1()
		throws Exception {
		Order fixture = new Order();
		fixture.setCustomer("");
		fixture.addTrade(new Trade());

		String result = fixture.getCustomer();

		assertEquals("", result);
	}

	@Test
	void testGetValue_1()
		throws Exception {
		Order fixture = new Order();
		fixture.setCustomer("");
		fixture.addTrade(new Trade());

		double result = fixture.getValue();

		assertEquals(0.0, result, 0.1);
	}

	@Test
	void testSetCustomer_1()
		throws Exception {
		Order fixture = new Order();
		fixture.setCustomer("");
		fixture.addTrade(new Trade());
		String customer = "";

		fixture.setCustomer(customer);

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