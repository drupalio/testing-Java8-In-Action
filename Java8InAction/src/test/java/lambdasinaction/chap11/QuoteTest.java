package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap11")
@RunWith(JUnitPlatform.class)
class QuoteTest {
	@Test
	void testQuote_1()
		throws Exception {
		String shopName = "";
		double price = 1.0;
		Discount.Code discountCode = Discount.Code.DIAMOND;

		Quote result = new Quote(shopName, price, discountCode);

		assertNotNull(result);
		assertEquals("", result.getShopName());
		assertEquals(1.0, result.getPrice(), 1.0);
	}

	@Test
	void testGetDiscountCode_1()
		throws Exception {
		Quote fixture = new Quote("", 1.0, Discount.Code.DIAMOND);

		Discount.Code result = fixture.getDiscountCode();

		assertNotNull(result);
		assertEquals("DIAMOND", result.name());
		assertEquals("DIAMOND", result.toString());
		assertEquals(4, result.ordinal());
	}

	@Test
	void testGetPrice_1()
		throws Exception {
		Quote fixture = new Quote("", 1.0, Discount.Code.DIAMOND);

		double result = fixture.getPrice();

		assertEquals(1.0, result, 0.1);
	}

	@Test
	void testGetShopName_1()
		throws Exception {
		Quote fixture = new Quote("", 1.0, Discount.Code.DIAMOND);

		String result = fixture.getShopName();

		assertEquals("", result);
	}

	@Disabled
	@Test
	void testParse_1()
		throws Exception {
		String s = "";

		Quote result = Quote.parse(s);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at lambdasinaction.chap11.Quote.parse(Quote.java:18)
		assertNotNull(result);
	}

	@Disabled
	@Test
	void testParse_2()
		throws Exception {
		String s = "";

		Quote result = Quote.parse(s);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at lambdasinaction.chap11.Quote.parse(Quote.java:18)
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