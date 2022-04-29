package week.day2.assignments.mandatory;

public class reverseevenwords {
	public static void main(String[] args) {
	String test = "I am a software tester";
    String[] test1=test.split(" ");
	System.out.println(test1);
	for (int i=0; i<test1.length; i++) {
		String test2=test1[i];
		//System.out.println(test2);
		String rev_value =" ";
		String value =" ";
		if (i%2!=0)
		{
		char[] array=test2.toCharArray();
		
			
		int count = array.length;
		//System.out.println(count);
		
			
			
			
			
			for(int j=count-1; j>=0; j--)
			{
				
			 rev_value = rev_value+test2.charAt(j);
			 //rev_value = rev_value+test2;
				
			}
			//System.out.println(rev_value);
		}
		else {
	
			value =test2;
			//System.out.println(rev_value+ " "+value);
		}
		System.out.println(rev_value+" "+value);
	}
	}

}
