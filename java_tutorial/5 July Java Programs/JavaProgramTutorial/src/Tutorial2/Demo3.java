package Tutorial2;

import java.util.regex.Pattern;

public class Demo3 {

	public static void main(String[] args) {
        String a = "Selenium  Selenium java testng";
        int spaceCount = 0;
        
        // Iterate through the string
        for (int i = 0; i < a.length(); i++) {
            // Check if the current character is a space
            if (a.charAt(i) == ' ') 
            {
                // Check if it's not preceded by another space
                if (Character.isLetter(a.charAt(i+1))) 
                {
                    spaceCount++;
                }
            }
        }
        
        System.out.println("Number of spaces: " + spaceCount);
    }

}
