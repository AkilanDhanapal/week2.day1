package week.day2.assignments.mandatory;
import java.util.Arrays;  
public class anagram {
	public static void main(String[] args) {
	String text1="stops";
	String text2="posts";
	if(text1.length()==text2.length())
	{
		  char[] ArrayT1 = text1.toLowerCase().toCharArray();  
          char[] ArrayT2 = text2.toLowerCase().toCharArray();  
          Arrays.sort(ArrayT1);  
          Arrays.sort(ArrayT2);  
          if (Arrays.equals(ArrayT1, ArrayT2)){
        	  System.out.println("Anagrams");  
          }
          else {
           	  System.out.println(" Not an Anagrams");  
          }
	}
	
	 else {
   	  System.out.println(" Not an Anagrams");  
     }
	}

}
