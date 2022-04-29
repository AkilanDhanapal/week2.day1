package week.day2.assignments.mandatory;

public class palindrome {
	public static void main(String[] args) {
		String a= "madam";
		String rev_value = "";
		int count=a.length();
		for(int i=count-1; i>=0; --i)
		{
			rev_value = rev_value+a.charAt(i);
		}
		if(a.equalsIgnoreCase(rev_value))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
