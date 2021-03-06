package lambdasinaction.chap6;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap6")
@RunWith(JUnitPlatform.class)
class GroupingTransactionsTest {
	@Test
	void testGroupingTransactions_1()
		throws Exception {
		GroupingTransactions result = new GroupingTransactions();
		assertNotNull(result);
	}

	@Test
	void testMain_1()
		throws Exception {

		GroupingTransactions.main();

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