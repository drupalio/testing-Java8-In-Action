package lambdasinaction.chap9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LetterTest {
	@Test
	void testAddFooter_1()
		throws Exception {
		String text = "";

		String result = Letter.addFooter(text);

		assertEquals("Kind regards", result);
	}

	@Test
	void testAddHeader_1()
		throws Exception {
		String text = "";

		String result = Letter.addHeader(text);

		assertEquals("From Raoul, Mario and Alan:", result);
	}

	@Test
	void testCheckSpelling_1()
		throws Exception {
		String text = "";

		String result = Letter.checkSpelling(text);

		assertEquals("", result);
	}

	@Test
	void testMain_1()
		throws Exception {

		Letter.main();

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