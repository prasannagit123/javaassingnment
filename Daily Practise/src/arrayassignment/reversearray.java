package arrayassignment;

import java.util.Arrays;

public class reversearray {
	
public static void main(String[] args) {
	

	{
		int [] num1={1,2,3,4,5};
		
		int start =0;
		int last=num1.length-1;
		int temp;
		
		while(start<last)
		{
			temp=num1[start];
			
			num1[start]=num1[last];
			
			num1[last]=temp;
			
			start++;
			last--;
		
		}
		System.out.println(Arrays.toString(num1));
		 
		
		}
}
}
 