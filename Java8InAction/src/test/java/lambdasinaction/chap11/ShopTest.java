package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShopTest {
	@Test
	void testShop_1()
		throws Exception {
		String name = "aaaa";

		Shop result = new Shop(name);

		assertNotNull(result);
		assertEquals("aaaa", result.getName());
	}

	@Test
	void testCalculatePrice_1()
		throws Exception {
		Shop fixture = new Shop("");
		String product = "aaa";

		double result = fixture.calculatePrice(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.Shop.<init>(Shop.java:15)
		assertEquals(0.0, result, 0.1);
	}

	@Test
	void testGetName_1()
		throws Exception {
		Shop fixture = new Shop("");

		String result = fixture.getName();

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.Shop.<init>(Shop.java:15)
		assertNotNull(result);
	}

	@Test
	void testGetPrice_1()
		throws Exception {
		Shop fixture = new Shop("");
		String product = "";

		String result = fixture.getPrice(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.Shop.<init>(Shop.java:15)
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