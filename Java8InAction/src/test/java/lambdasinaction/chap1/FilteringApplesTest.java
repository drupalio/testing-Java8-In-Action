package lambdasinaction.chap1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.function.Executable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilteringApplesTest {
	@Test
	void testFilterApples_1()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		Predicate<FilteringApples.Apple> p = mock(Predicate.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApples(inventory, p);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterApples(FilteringApples.java:66)
		assertNotNull(result);
	}

	@Test
	void testFilterApples_2()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		Predicate<FilteringApples.Apple> p = mock(Predicate.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApples(inventory, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterApples(FilteringApples.java:66)
		assertNotNull(result);
	}

	@Test
	void testFilterApples_3()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		Predicate<FilteringApples.Apple> p = mock(Predicate.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApples(inventory, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterApples(FilteringApples.java:66)
		assertNotNull(result);
	}

	@Test
	void testFilterGreenApples_1()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterGreenApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterGreenApples(FilteringApples.java:38)
		assertNotNull(result);
	}

	@Test
	void testFilterGreenApples_2()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterGreenApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterGreenApples(FilteringApples.java:38)
		assertNotNull(result);
	}

	@Test
	void testFilterGreenApples_3()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterGreenApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterGreenApples(FilteringApples.java:38)
		assertNotNull(result);
	}

	@Test
	void testFilterHeavyApples_1()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterHeavyApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterHeavyApples(FilteringApples.java:48)
		assertNotNull(result);
	}

	@Test
	void testFilterHeavyApples_2()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterHeavyApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterHeavyApples(FilteringApples.java:48)
		assertNotNull(result);
	}

	@Test
	void testFilterHeavyApples_3()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterHeavyApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap1.FilteringApples.filterHeavyApples(FilteringApples.java:48)
		assertNotNull(result);
	}

	@Test
	void testIsGreenApple_1()
		throws Exception {
		FilteringApples.Apple apple = new FilteringApples.Apple(1, "green");

		boolean result = FilteringApples.isGreenApple(apple);

		assertEquals(true, result);
	}

	@Test
	void testIsGreenApple_2()
		throws Exception {
		FilteringApples.Apple apple = new FilteringApples.Apple(1, "");

		boolean result = FilteringApples.isGreenApple(apple);

		assertEquals(false, result);
	}

	@Test
	void testIsHeavyApple_1()
		throws Exception {
		FilteringApples.Apple apple = new FilteringApples.Apple(151, "");

		boolean result = FilteringApples.isHeavyApple(apple);

		assertEquals(true, result);
	}

	@Test
	void testIsHeavyApple_2()
		throws Exception {
		FilteringApples.Apple apple = new FilteringApples.Apple(1, "");

		boolean result = FilteringApples.isHeavyApple(apple);

		assertEquals(false, result);
	}

	@Test
	void testMain_1()
		throws Exception {

		FilteringApples.main();

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