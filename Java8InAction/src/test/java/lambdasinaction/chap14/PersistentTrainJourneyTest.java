package lambdasinaction.chap14;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.function.Consumer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap14")
@RunWith(JUnitPlatform.class)
class PersistentTrainJourneyTest {
	@Test
	void testAppend_1()
		throws Exception {
		PersistentTrainJourney.TrainJourney a = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null)));
		PersistentTrainJourney.TrainJourney b = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null));

		PersistentTrainJourney.TrainJourney result = PersistentTrainJourney.append(a, b);

		assertNotNull(result);
	}

	@Test
	void testAppend_2()
		throws Exception {
		PersistentTrainJourney.TrainJourney a = null;
		PersistentTrainJourney.TrainJourney b = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null));

		PersistentTrainJourney.TrainJourney result = PersistentTrainJourney.append(a, b);

		assertNotNull(result);
	}

	@Test
	void testLink_1()
		throws Exception {
		PersistentTrainJourney.TrainJourney a = null;
		PersistentTrainJourney.TrainJourney b = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null));

		PersistentTrainJourney.TrainJourney result = PersistentTrainJourney.link(a, b);

		assertNotNull(result);
	}

	@Test
	void testLink_2()
		throws Exception {
		PersistentTrainJourney.TrainJourney a = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null)));
		PersistentTrainJourney.TrainJourney b = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null));

		PersistentTrainJourney.TrainJourney result = PersistentTrainJourney.link(a, b);

		assertNotNull(result);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		PersistentTrainJourney.main(args);

	}

	@Test
	void testVisit_1()
		throws Exception {
		PersistentTrainJourney.TrainJourney journey = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null)));
		Consumer<PersistentTrainJourney.TrainJourney> c = mock(Consumer.class);
		// add mock object expectations here


		PersistentTrainJourney.visit(journey, c);

	}

	@Test
	void testVisit_2()
		throws Exception {
		PersistentTrainJourney.TrainJourney journey = null;
		Consumer<PersistentTrainJourney.TrainJourney> c = mock(Consumer.class);
		// add mock object expectations here


		PersistentTrainJourney.visit(journey, c);

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