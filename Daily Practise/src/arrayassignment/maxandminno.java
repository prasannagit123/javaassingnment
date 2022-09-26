package arrayassignment;

public class maxandminno {
	public static void minmax(int [] num)
	{
		// first i assume max value at index 0
		int max=num[0];
		int min=num[0];
		
		
		for(int i=1 ;i<num.length;i++) //loop would starts from index 1 because 
			                    //i already assume at the o value is max
		     {
			if(max<num[i])
			{
				max=num[i];//this will replace max value if condition gets true
				
			}
			
			if(min>num[i])
			{
				min=num[i];//this will replace min value if condtion get true 
				
			}
			
				}
		
		System.out.println("max value is : " +max);
		System.out.println("min value is : " +min);
		
	}

	   public static void main(String[] args) 
	   {
		int [] num= {1,2,3,4};
		
	    minmax(num);
	}
}
