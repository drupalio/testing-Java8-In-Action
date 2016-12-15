package lambdasinaction.appd;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class LambdaTest {
	@Test
	 void testLambda_1()
		throws Exception {
		Lambda result = new Lambda();
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