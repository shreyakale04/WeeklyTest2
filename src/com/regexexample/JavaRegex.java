package com.regexexample;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class JavaRegex {

	public static void main(String[] args) {
		
		// Example 1: Matching a specific pattern 
		System.out.println("Example 1: Matching a specific pattern");
		
	    // Define the text in which to search  
		String text1 = "The quick brown fox jumps over the lazy dog";  
		
		 // Define the pattern to match  
		String pattern1 = "fox";
		
		// Check if the pattern matches the text using Pattern.matches()  
		
		boolean matches1 = Pattern.matches(pattern1, text1); 
		 // Output whether the text contains the pattern  
		System.out.println("Does the text contain the word 'fox'? " + matches1);
		
		
		//------------------------------------------------------------------------

		
		// Example 2: Using Pattern and Matcher classes  
        System.out.println("\nExample 2: Using Pattern and Matcher classes");  
        // Define the text to search within  
        
        String text2 = "Java is a programming language";  
        // Define the regex pattern to match 3-letter words  
        String regex2 = "\\b\\w{3}\\b";  
        
        //Compile the regex pattern into a Pattern object  
        Pattern pattern2 = Pattern.compile(regex2);  
        
     // Create a Matcher object to apply the pattern on the text  
        Matcher matcher2 = pattern2.matcher(text2);   
	
     // Find and output all matches found by iterating over Matcher's results  
        System.out.print("3-letter words in the text: ");
        
        
        while (matcher2.find()) {  
            System.out.print(matcher2.group() + " ");  
        }  
        System.out.println();  
        
     // Example 3: Replacing matched patterns  
        System.out.println("\nExample 3: Replacing matched patterns"); 
        
        // Define the text in which to search  
        String text3 = "The cat sat on the mat";  
        
        // Define the regex pattern to match the word 'cat'  
        String regex3 = "\\bcat\\b";
        
        // Define the replacement string  
        String replacement3 = "dog";  
        
        // Replace all occurrences of 'cat' with 'dog' using String's replaceAll()  
        // method  
        String replacedText3 = text3.replaceAll(regex3, replacement3);  
        
        // Output the original and replaced text  
        System.out.println("Original text: " + text3);  
        System.out.println("Replaced text: " + replacedText3);  
 
        // Example 4: Splitting text using regex  
        System.out.println("\nExample 4: Splitting text using regex");
        
        // Define the text to split  
        String text4 = "apple,banana,orange,grape";  
        
        // Define the regex pattern for splitting by comma  
        String regex4 = ",";  
        
        // Split the text using the regex pattern into an array of strings  
        String[] parts4 = text4.split(regex4);  
        
        // Output the split parts  
        System.out.print("Fruits separated: "); 
        
        for (String part : parts4) {  
            System.out.print(part + " ");  
        }  
        System.out.println();  
	
	}
	

}
