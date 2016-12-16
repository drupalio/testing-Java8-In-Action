package lambdasinaction.chap14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap14")
@RunWith(JUnitPlatform.class)
class PersistentTreeTest {
	@Test
	void testFupdate_1()
		throws Exception {
		String k = "";
		int newval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		PersistentTree.Tree result = PersistentTree.fupdate(k, newval, t);

		assertNotNull(result);
	}

	@Test
	void testFupdate_2()
		throws Exception {
		String k = "";
		int newval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		PersistentTree.Tree result = PersistentTree.fupdate(k, newval, t);

		assertNotNull(result);
	}

	@Test
	void testFupdate_3()
		throws Exception {
		String k = "";
		int newval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		PersistentTree.Tree result = PersistentTree.fupdate(k, newval, t);

		assertNotNull(result);
	}

	@Test
	void testFupdate_4()
		throws Exception {
		String k = "";
		int newval = 1;
		PersistentTree.Tree t = null;

		PersistentTree.Tree result = PersistentTree.fupdate(k, newval, t);

		assertNotNull(result);
	}

	@Test
	void testLookup_1()
		throws Exception {
		String k = "";
		int defaultval = 1;
		PersistentTree.Tree t = null;

		int result = PersistentTree.lookup(k, defaultval, t);

		assertEquals(1, result);
	}

	@Test
	void testLookup_2()
		throws Exception {
		String k = "";
		int defaultval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		int result = PersistentTree.lookup(k, defaultval, t);

		assertEquals(1, result);
	}

	@Test
	void testLookup_3()
		throws Exception {
		String k = "";
		int defaultval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		int result = PersistentTree.lookup(k, defaultval, t);

		assertEquals(1, result);
	}

	@Test
	void testLookup_4()
		throws Exception {
		String k = "";
		int defaultval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		int result = PersistentTree.lookup(k, defaultval, t);

		assertEquals(1, result);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		PersistentTree.main(args);

	}

	@Test
	void testUpdate_1()
		throws Exception {
		String k = "";
		int newval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		PersistentTree.Tree result = PersistentTree.update(k, newval, t);

		assertNotNull(result);
	}

	@Test
	void testUpdate_2()
		throws Exception {
		String k = "";
		int newval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		PersistentTree.Tree result = PersistentTree.update(k, newval, t);

		assertNotNull(result);
	}

	@Test
	void testUpdate_3()
		throws Exception {
		String k = "";
		int newval = 1;
		PersistentTree.Tree t = new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)), new PersistentTree.Tree("", 1, new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null), new PersistentTree.Tree("", 0, (PersistentTree.Tree) null, (PersistentTree.Tree) null)));

		PersistentTree.Tree result = PersistentTree.update(k, newval, t);

		assertNotNull(result);
	}

	@Test
	void testUpdate_4()
		throws Exception {
		String k = "";
		int newval = 1;
		PersistentTree.Tree t = null;

		PersistentTree.Tree result = PersistentTree.update(k, newval, t);

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