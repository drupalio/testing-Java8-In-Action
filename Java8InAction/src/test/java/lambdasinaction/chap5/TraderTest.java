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
class TraderTest {
	@Test
	void testTrader_1()
		throws Exception {
		String n = "";
		String c = "";

		Trader result = new Trader(n, c);

		assertAll("trader", () -> {
			assertNotNull(result);
			assertEquals("Trader: in ", result.toString());
			assertEquals("", result.getName());
			assertEquals("", result.getCity());
		});
	}

	@Test
	void testGetCity_1()
		throws Exception {
		Trader fixture = new Trader("", "");

		String result = fixture.getCity();

		assertEquals("", result);
	}

	@Test
	void testGetName_1()
		throws Exception {
		Trader fixture = new Trader("", "");

		String result = fixture.getName();

		assertEquals("", result);
	}

	@Test
	void testSetCity_1()
		throws Exception {
		Trader fixture = new Trader("", "");
		String newCity = "";

		fixture.setCity(newCity);

	}

	@Test
	void testToString_1()
		throws Exception {
		Trader fixture = new Trader("", "");

		String result = fixture.toString();

		assertEquals("Trader: in ", result);
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