package Java;

public class palidromenumber {
	
	
	public static void palindrome(int n) {
		
	int r=0;
	int sum=0;
	
	int temp=0;
	temp=n;
	
	while(n>0)
	{
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
	
	}
	
	if(temp==sum)
	{
		System.out.println("palindrome number");
		
	}
	
	else 
	{
		System.out.println("not palindrome number");
	     
	}

	}
	
	public static void main(String[] args) {
		palindrome(301);
	}
	
	

}
