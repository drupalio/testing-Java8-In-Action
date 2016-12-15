package lambdasinaction.chap11;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AsyncShopClientTest {
	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		AsyncShopClient.main(args);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: java.util.concurrent.ExecutionException: java.lang.RuntimeException: product not available
		//       at lambdasinaction.chap11.AsyncShopClient.main(AsyncShopClient.java:16)
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