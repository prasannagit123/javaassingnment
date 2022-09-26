package Java;

public class NumberofVowelInString {
	public static void main(String [] args)
	{
		String s1="vishwajeet";
		 int count=0 ;
		 
		 for(int i=0 ; i<s1.length();i++)
		 {
			 if(s1.charAt(i)=='a' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u' || s1.charAt(i)=='e')
			 {
				count++;
			 }
		 }
		 
		 System.out.println("Total no of vowels in string are: " + count);
		
	}

}
