package Java;

public class RemoveCharFromFirstStringPresentInSecond{
	
	
 public static String removeChar(String str1 , String str2)
 {
	 for(int index=0; index<str2.length();index++)
	 {
		 char i= str2.charAt(index);
		 
		 while(str1.contains(i + " "))
		 {
			 //int itr = str1.indexOf(i);
		   str1 = str1.replace((i + " "), " "); 
	 }
		
 }
	 
	 return str1; 
}
 
 
 
 public static void main(String[] args) {
	 	 
	System.out.println(removeChar("delhi is capital","mumbai is susbcapital"));
		 
}
 
}
