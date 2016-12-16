package lambdasinaction.chap10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap10")
@RunWith(JUnitPlatform.class)
 class CarTest {
	@Test
	 void testGetInsurance_1()
		throws Exception {
		Car fixture = new Car();

		Optional<Insurance> result = fixture.getInsurance();

		assertEquals(null, result);
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