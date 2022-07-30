import static org.junit.Assert.*;

import org.junit.Test;

import Stack.MinStack;
import Stack.BalancingString;

public class AppTest {

	
	BalancingString sl = new BalancingString();
	
	

		@Test
		public void  When_StringHasSameSetOfOpenAndCloseBrackets_Expect_true()
		{
			String input = "({[]{}()})";
			
			
			assertEquals(true,sl.isValid(input));
		}
	
		
	    @Test
		public void When_StringhasDifferentSetOfOpenAndCloseBrackets_Expect_true()
		{
			String input = "(][){}";
			
			assertEquals(false,sl.isValid(input));
		}
	
		
		@Test
		public void  When_StringHasdifferentSetofOpenAndCloseBrackets_Expect_true()
		{
			String input = "{[()}";
			
			
			assertEquals(false,sl.isValid(input));
		}
	
		
		@Test
		public void  When_StringHasdifferentSetOfOpenandCloseBrackets_Expect_true()
		{
			String input = "{[(])";
			
			
			assertEquals(false,sl.isValid(input));
		}
	
		
		@Test
		public void  When_StringHasDifferentsetOfOpenAndCloseBrackets_Expect_true()
		{
			String input = "(){}][";
			
			
			assertEquals(false,sl.isValid(input));
		}
	
		
		@Test
		public void   When_StringHasSameSetOfOpenAndCloseBrackets_Expect_True()
		{
			String input = "{{}[]()[()]}";
			
			
			assertEquals(true,sl.isValid(input));
		}
	
	
	}

	

