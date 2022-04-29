package week.day2.assignments.mandatory;
import java.lang.*; 
public class findtype {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd class of automation $$";
		int letter =0, space=0, num=0, specialchar=0;
		char[] char1= test.toCharArray();
		
		for (int i = 0; i < test.length()-1; i++) {
		    if (Character.isLetter(char1[i])) {
		       letter= letter+1;
		    }
		    else if (Character.isDigit(char1[i])) {
		    	num= num+1;
		    
		    }
		    else if (Character.isSpaceChar(char1[i])) {
		    	space= space+1;
		    
		    }
		    else
		    	specialchar=specialchar+1;
		}
		System.out.println("Letters are " +letter);
		System.out.println("WhiteSpace are " +space);
		System.out.println("Numericals are " +num);
		System.out.println("Special characters are " +specialchar);
	}
	

}
