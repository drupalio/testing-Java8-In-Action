package lambdasinaction.chap10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	@Test
	void testGetCar_1()
		throws Exception {
		Person fixture = new Person();

		Optional<Car> result = fixture.getCar();

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