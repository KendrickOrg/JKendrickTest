package tests.jKendrick.simulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jKendrick.rates.Rate;
import jKendrick.simulation.Concern;
import jKendrick.simulation.IRates;
class ConcernTest {

	@Test
	void test() {
		Concern ABC=new Concern("status","A B C", "x y z");
		
		assertEquals(0, ABC.indexOfCompartment("A"));
		assertEquals(2, ABC.indexOfCompartment("C"));
		
		assertEquals(0, ABC.getParameter("x"));
		
		ABC.setParameter("y", 1.5);
		
		assertEquals(1.5, ABC.getParameter("y"));
		IRates z=new Rate("z");
		IRates x=new Rate("x");
		IRates y=new Rate("y");
		
		ABC.setTransitionRate("B", "C", z);
		ABC.setTransitionRate("A", "C", x);
		ABC.setTransitionRate("C", "A", y);
		
		
		assertThrows(AssertionError.class,
	            ()->{new Concern("status","", "x y z");} );
		
		Concern noParam=new Concern("status","A B C", "");
		noParam.setParameter("i", 2.3);
		assertEquals(2.3, noParam.getParameter("i"));
		
		
	}

}
