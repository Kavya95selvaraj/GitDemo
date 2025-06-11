
public class CoreJavaBasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Two types of string creation
		//1.Sting literal
		String s="Selenium Java Testing";
		//2.Using new opeartor
		String s1=new String("Java");
		
	//Spliting the strings using space
		String s2="Selenium Java Testing";
		String[] splits2=s2.split(" ");
		System.out.println(splits2[0]);
		System.out.println(splits2[1]);
		System.out.println(splits2[2]);
		System.out.println("*********");
	//Splitting the string using Java	
		String[] splits3=s2.split("Java");
		System.out.println(splits3[0]);
		System.out.println(splits3[1].trim());//trimming the space before testing
	//Printing the string character by character
		for(int i=0;i<s2.length();i++)
		{
			System.out.println(s2.charAt(i));
		}
		//Printing the string character by character in reverse order
		System.out.println("Printing the string character by character in reverse order");
		for(int i=s2.length()-1;i>=0;i--)
		{
			System.out.println(s2.charAt(i));
		}
		
				
		

	}

}
