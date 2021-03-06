package lambdasinaction.chap8;

import static org.mockito.Mockito.mock;

import java.util.function.Consumer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap8")
@RunWith(JUnitPlatform.class)
class OnlineBankingLambdaTest {
	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		OnlineBankingLambda.main(args);

	}

	@Test
	void testProcessCustomer_1()throws Exception {
		OnlineBankingLambda fixture = new OnlineBankingLambda();
		int id = 1;
		Consumer<OnlineBankingLambda.Customer> makeCustomerHappy = mock(Consumer.class);
		// add mock object expectations here


		fixture.processCustomer(id, makeCustomerHappy);

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