package lambdasinaction.chap13;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap13")
@RunWith(JUnitPlatform.class)
class SubsetsMainTest {
	@Disabled
	@Test
	void testConcat_1()
		throws Exception {
		List<List<Integer>> a = mock(List.class);
		List<List<Integer>> b = mock(List.class);
		// add mock object expectations here


		List<List<Integer>> result = SubsetsMain.concat(a, b);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.ArrayList.<init>(Unknown Source)
		//       at lambdasinaction.chap13.SubsetsMain.concat(SubsetsMain.java:40)
		assertNotNull(result);
	}

	@Disabled
	@Test
	void testInsertAll_1()
		throws Exception {
		Integer first = new Integer(1);
		List<List<Integer>> lists = mock(List.class);
		// add mock object expectations here


		List<List<Integer>> result = SubsetsMain.insertAll(first, lists);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap13.SubsetsMain.insertAll(SubsetsMain.java:30)
		assertNotNull(result);
	}

	@Disabled
	@Test
	void testInsertAll_2()
		throws Exception {
		Integer first = new Integer(1);
		List<List<Integer>> lists = mock(List.class);
		// add mock object expectations here


		List<List<Integer>> result = SubsetsMain.insertAll(first, lists);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap13.SubsetsMain.insertAll(SubsetsMain.java:30)
		assertNotNull(result);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		SubsetsMain.main(args);

	}

	@Test
	void testSubsets_1()
		throws Exception {
		List<Integer> l = mock(List.class);
		// add mock object expectations here


		List<List<Integer>> result = SubsetsMain.subsets(l);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at com.sun.proxy.$Proxy59.get(Unknown Source)
		//       at lambdasinaction.chap13.SubsetsMain.subsets(SubsetsMain.java:21)
		assertNotNull(result);
	}

	@Test
	void testSubsets_2()
		throws Exception {
		List<Integer> l = mock(List.class);
		// add mock object expectations here


		List<List<Integer>> result = SubsetsMain.subsets(l);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at com.sun.proxy.$Proxy59.get(Unknown Source)
		//       at lambdasinaction.chap13.SubsetsMain.subsets(SubsetsMain.java:21)
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