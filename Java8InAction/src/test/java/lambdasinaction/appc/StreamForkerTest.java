package lambdasinaction.appc;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("appc")
@RunWith(JUnitPlatform.class)
 class StreamForkerTest {
	@Test
	 void testStreamForker_1()
		throws Exception {
		Stream<Object> stream = mock(Stream.class);
		// add mock object expectations here


		StreamForker result = new StreamForker(stream);

		assertNotNull(result);
	}

	@Test
	 void testFork_1()
		throws Exception {
		StreamForker fixture = new StreamForker(mock(Stream.class));
		Object key = mock(Object.class);
		Function<Stream<Object>, Object> f = mock(Function.class);
		// add mock object expectations here


		StreamForker<Object> result = fixture.fork(key, f);

		assertNotNull(result);
	}

	@Disabled
	@Test
	 void testGetResults_1()
		throws Exception {
		StreamForker fixture = new StreamForker(mock(Stream.class));

		StreamForker.Results result = fixture.getResults();

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.appc.StreamForker.getResults(StreamForker.java:28)
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