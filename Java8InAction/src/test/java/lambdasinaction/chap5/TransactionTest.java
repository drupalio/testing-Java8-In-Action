package lambdasinaction.chap5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap5")
@RunWith(JUnitPlatform.class)
class TransactionTest {
	@Test
	void testTransaction_1()
		throws Exception {
		Trader trader = new Trader("", "");
		int year = 1;
		int value = 1;

		Transaction result = new Transaction(trader, year, value);

		assertAll("trader", () -> {
			assertNotNull(result);
			assertEquals("{Trader: in , year: 1, value:1}", result.toString());
			assertEquals(1, result.getValue());
			assertEquals(1, result.getYear());
		});
	}

	@Test
	void testGetTrader_1()
		throws Exception {
		Transaction fixture = new Transaction(new Trader("", ""), 1, 1);

		Trader result = fixture.getTrader();

		assertNotNull(result);
		assertEquals("Trader: in ", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getCity());
	}

	@Test
	void testGetValue_1()
		throws Exception {
		Transaction fixture = new Transaction(new Trader("", ""), 1, 1);

		int result = fixture.getValue();

		assertEquals(1, result);
	}

	@Test
	void testGetYear_1()
		throws Exception {
		Transaction fixture = new Transaction(new Trader("", ""), 1, 1);

		int result = fixture.getYear();

		assertEquals(1, result);
	}

	@Test
	void testToString_1()
		throws Exception {
		Transaction fixture = new Transaction(new Trader("", ""), 1, 1);

		String result = fixture.toString();

		assertEquals("{Trader: in , year: 1, value:1}", result);
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