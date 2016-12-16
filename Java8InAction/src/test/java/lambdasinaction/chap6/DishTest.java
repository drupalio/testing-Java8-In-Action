package lambdasinaction.chap6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap6")
@RunWith(JUnitPlatform.class)
class DishTest {
	@Test
	void testDish_1()
		throws Exception {
		String name = "";
		boolean vegetarian = true;
		int calories = 1;
		Dish.Type type = Dish.Type.FISH;

		Dish result = new Dish(name, vegetarian, calories, type);

		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isVegetarian());
		assertEquals(1, result.getCalories());
	}

	@Test
	void testGetCalories_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		int result = fixture.getCalories();

		assertEquals(1, result);
	}

	@Test
	void testGetName_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		String result = fixture.getName();

		assertEquals("", result);
	}

	@Test
	void testGetType_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		Dish.Type result = fixture.getType();

		assertNotNull(result);
		assertEquals("FISH", result.name());
		assertEquals("FISH", result.toString());
		assertEquals(1, result.ordinal());
	}

	@Test
	void testIsVegetarian_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		boolean result = fixture.isVegetarian();

		assertEquals(true, result);
	}

	@Test
	void testIsVegetarian_2()
		throws Exception {
		Dish fixture = new Dish("", false, 1, Dish.Type.FISH);

		boolean result = fixture.isVegetarian();

		assertEquals(false, result);
	}

	@Test
	void testToString_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		String result = fixture.toString();

		assertEquals("", result);
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