package Java;

public class reverseSENTENCE {
	public static void main(String args[])
	{
		String s1[]="you shall not pass".split(" ");
		String s2=" " ;
		for(int i=s1.length-1;i>=0;i--)
		{

		s2=s2+" "+s1[i];

		}

		System.out.println(s2);
		}



	
}
