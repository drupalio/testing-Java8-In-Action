package lambdasinaction.chap8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebuggingTest {
	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		Debugging.main(args);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap8.Debugging.lambda$0(Debugging.java:9)
		//       at lambdasinaction.chap8.Debugging$$Lambda$306/539584182.apply(Unknown Source)
		//       at java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)
		//       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Unknown Source)
		//       at java.util.stream.AbstractPipeline.copyInto(Unknown Source)
		//       at java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
		//       at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
		//       at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
		//       at java.util.stream.AbstractPipeline.evaluate(Unknown Source)
		//       at java.util.stream.ReferencePipeline.forEach(Unknown Source)
		//       at lambdasinaction.chap8.Debugging.main(Debugging.java:9)
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