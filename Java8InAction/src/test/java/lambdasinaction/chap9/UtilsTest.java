package lambdasinaction.chap9;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UtilsTest {
	@Test
	void testPaint_1()
		throws Exception {
		List<Resizable> l = mock(List.class);
		// add mock object expectations here


		Utils.paint(l);

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