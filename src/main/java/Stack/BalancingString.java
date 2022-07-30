package Stack;

import java.util.Stack;

public class BalancingString {
	MinStack minstack = new MinStack();
	
	public static boolean isValid(String s) {
		
		
		MinStack minstack = new MinStack();
		
		for(int i=0;i<s.length(); i++) {
			
			Character c=s.charAt(i);
		
        	if (c == '(' || c == '{' || c == '[') {
        		minstack.push(c);
            }
            
            else if (c == ')' && !minstack.isEmpty() && minstack.top() == '(') {
            	minstack.pop();
            } else if (c == '}' && !minstack.isEmpty() && minstack.top() == '{') {
            	minstack.pop();
            } else if (c == ']' && !minstack.isEmpty() && minstack.top() == '[') {
            	minstack.pop();
            }
            
            else {
                minstack.push(s.charAt(i));
            }
        }
        if(minstack.isEmpty()){
        	return true;
        }else {
        	return false;
        }
   
        
    }

	
    public static void main(String[] args) {
		
    	
    	BalancingString bl = new BalancingString();
    	
    	String s = "([]{}[])";
        boolean check = bl.isValid(s);
            if(check){
                  System.out.println("true");
              }
              else{
                  System.out.println("false");
              }
    }
	
}
    			
    			
    			
    			