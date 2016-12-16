package lambdasinaction.chap5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap5")
@RunWith(JUnitPlatform.class)
class BuildingStreamsTest {
	@Disabled
	@Test//(expected = java.nio.file.NoSuchFileException.class)
	void testMain_1()
		throws Exception {

		BuildingStreams.main();

	}

	@Disabled
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