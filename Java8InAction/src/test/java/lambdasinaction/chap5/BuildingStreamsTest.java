package lambdasinaction.chap5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BuildingStreamsTest {
	@Test//(expected = java.nio.file.NoSuchFileException.class)
	void testMain_1()
		throws Exception {

		BuildingStreams.main();

	}

	@Test//(expected = java.nio.file.NoSuchFileException.class)
	void testMain_2()
		throws Exception {

		BuildingStreams.main();

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