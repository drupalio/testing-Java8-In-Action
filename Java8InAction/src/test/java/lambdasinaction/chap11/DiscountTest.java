package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap11")
@RunWith(JUnitPlatform.class)
class DiscountTest {
	@Test
	void testApplyDiscount_1()
		throws Exception {
		Quote quote = new Quote("", 1.0, Discount.Code.DIAMOND);

		String result = Discount.applyDiscount(quote);

		assertEquals(" price is 0.8", result);
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