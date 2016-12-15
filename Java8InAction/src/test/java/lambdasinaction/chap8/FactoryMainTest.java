package lambdasinaction.chap8;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FactoryMainTest {
	@Test
	void testFactoryMain_1()
		throws Exception {
		FactoryMain result = new FactoryMain();
		assertNotNull(result);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		FactoryMain.main(args);

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