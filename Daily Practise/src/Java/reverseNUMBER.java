package Java;

public class reverseNUMBER {
	public static int reversenum(int n)
	{
         int rem = 0;
         int rev = 0;
         
        while(n>0)
         {
        	 rem=n%10;
        	 rev=(rev*10)+rem;
        	 n=n/10;
         }
         return rev; 
	     }
	public static void main(String[] args) {
		
		System.out.println(reversenum(1234));
	}
	
	
	
}
