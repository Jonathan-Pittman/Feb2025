package Lab1;

public class Lab1_10 {
	 public static boolean isPositiveString(String str) {
	        
	        for (int i = 0; i < str.length() - 1; i++) {
	            // Checks if the next character comes after the current character in alphabetical order
	            if (str.charAt(i) > str.charAt(i + 1)) {
	                return false; 
	                }
	        }
	        return true; 
	        }
	    
	    public static void main(String[] args) {
	        // Testing the String
	        String test1 = "ANT";
	        String test2 = "BAD";
	        
	        System.out.println("Is '" + test1 + "' a positive string? " + isPositiveString(test1));
	        System.out.println("Is '" + test2 + "' a positive string? " + isPositiveString(test2));
	    }
}
