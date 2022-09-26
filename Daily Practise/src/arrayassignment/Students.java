package arrayassignment;

public class Students {
	
	public String name;
	
	Students(String name)
	{
		this.name=name;
		
	}
	
	//A string representation of an object can be obtained using the toString() method in Java. 
	//This method is overridden so that the object values can be returned.
	public String toString() {
		return name;
	}
	
	
	public static void main(String[] args) {
		
		Students[] mystudent  =new Students[] {new Students("Dharma"),new Students("ram")
				,new Students("nixon"),new Students("hitesh")};
		
		for(Students m: mystudent) {
			System.out.println(m);
			
		}
	}

}
