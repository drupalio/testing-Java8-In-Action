package lambdasinaction.chap11.v1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.Future;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@Tag("chap11")
@RunWith(JUnitPlatform.class)
class ShopTest {
	@Test
	void testShop_1()
		throws Exception {
		String name = "aaaa";

		Shop result = new Shop(name);

		assertNotNull(result);
		assertEquals("aaaa", result.getName());
	}
	@Disabled
	@Test
	void testGetName_1()
		throws Exception {
		Shop fixture = new Shop("");

		String result = fixture.getName();

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.v1.Shop.<init>(Shop.java:16)
		assertNotNull(result);
	}
	@Disabled
	@Test
	void testGetPrice_1()
		throws Exception {
		Shop fixture = new Shop("");
		String product = "";

		double result = fixture.getPrice(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.v1.Shop.<init>(Shop.java:16)
		assertEquals(0.0, result, 0.1);
	}
	@Disabled
	@Test
	void testGetPriceAsync_1()
		throws Exception {
		Shop fixture = new Shop("");
		String product = "";

		Future<Double> result = fixture.getPriceAsync(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.v1.Shop.<init>(Shop.java:16)
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