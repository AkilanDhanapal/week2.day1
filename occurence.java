package week.day2.assignments.mandatory;

public class occurence {
	public static void main(String[] args) {
	String str = "welcome to chennai";
	char single_char = 'e';
	int count = 0;
	 
	for (int i = 0; i < str.length(); i++) {
	    if (str.charAt(i) == single_char) {
	        count++;
	    }
	}
	System.out.println("occurence of e is - " +count); 
	}
}
