package Stack;

import java.util.Stack;

public class StackLincked {
	
	public static boolean isValid(String s) {
		Stack<Character> leftSymbols = new Stack<Character>();
        for (char c : s.toCharArray()) {
        	if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            }
            
            else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
   
        
    }

	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	
    	String s = "{(}[])";
        boolean check = isValid(s);
            if(check){
                  System.out.println("true");
              }
              else{
                  System.out.println("false");
              }
    }
	
}
