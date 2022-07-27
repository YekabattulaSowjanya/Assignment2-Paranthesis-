import static org.junit.Assert.*;

import org.junit.Test;

import Stack.MinStack;
import Stack.StackLincked;

public class AppTest {

	
	StackLincked sl = new StackLincked();
	MinStack stack = new MinStack();
	

		@Test
		public void  When_StringHasSameSetOfOpenAndCloseBrackets_Expect_true()
		{
			String input = "()";
			
			
			assertEquals(true,sl.isValid(input));
		}
	
		
		@Test
		public void When_StringhasDifferentSetOfOpenAndCloseBrackets_Expect_true()
		{
			String input = "(][){}";
			
			assertEquals(false,sl.isValid(input));
		}
	
	
	}

	

