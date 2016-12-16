package lambdasinaction.chap3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap3")
@RunWith(JUnitPlatform.class)
class ExecuteAroundTest {
	
	@Test
	void fileNotFoundException() {
		Throwable exception = assertThrows(java.io.FileNotFoundException.class, () -> {
            throw new java.io.FileNotFoundException("file not found");
        });
        assertEquals("file not found", exception.getMessage());
	}
	
	@Disabled
	@Test//(expected = java.io.FileNotFoundException.class)
	void testMain_1()
		throws Exception {

		ExecuteAround.main();
		assertThrows(java.io.FileNotFoundException.class, () -> {
			 fileNotFoundException();
		      });
	}

	@Disabled
	@Test//(expected = java.io.FileNotFoundException.class)
	void testMain_2()
		throws Exception {

		ExecuteAround.main();

	}

	@Disabled
	@Test//(expected = java.io.FileNotFoundException.class)
	void testMain_3()
		throws Exception {

		ExecuteAround.main();

	}

	@Disabled
	@Test//(expected = java.io.FileNotFoundException.class)
	void testMain_4()
		throws Exception {

		ExecuteAround.main();

	}

	@Disabled
	@Test//(expected = java.io.FileNotFoundException.class)
	void testProcessFile_1()
		throws Exception {
		ExecuteAround.BufferedReaderProcessor p = mock(ExecuteAround.BufferedReaderProcessor.class);
		// add mock object expectations here


		String result = ExecuteAround.processFile(p);

		assertNotNull(result);
	}

	@Disabled
	@Test//(expected = java.io.FileNotFoundException.class)
	void testProcessFile_2()
		throws Exception {
		ExecuteAround.BufferedReaderProcessor p = mock(ExecuteAround.BufferedReaderProcessor.class);
		// add mock object expectations here


		String result = ExecuteAround.processFile(p);

		assertNotNull(result);
	}

	@Disabled
	@Test//(expected = java.io.FileNotFoundException.class)
	void testProcessFileLimited_1()
		throws Exception {

		String result = ExecuteAround.processFileLimited();

		assertNotNull(result);
	}
	@Disabled
	@Test//(expected = java.io.FileNotFoundException.class)
	void testProcessFileLimited_2()
		throws Exception {

		String result = ExecuteAround.processFileLimited();

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