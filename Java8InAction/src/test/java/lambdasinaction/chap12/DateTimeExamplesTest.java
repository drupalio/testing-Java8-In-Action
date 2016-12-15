package lambdasinaction.chap12;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTimeExamplesTest {
	@Test
	void testDateTimeExamples_1()
		throws Exception {
		DateTimeExamples result = new DateTimeExamples();
		assertNotNull(result);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		DateTimeExamples.main(args);

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