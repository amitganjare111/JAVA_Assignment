package Constructor12;


public class Constructor1 {
	Constructor1() 
	{
	System.out.println("no argument");
	}
	
	Constructor1(int x)     
	{
	    this();	 
	    //call no argument constructor 
		System.out.println("one  argument");

	}
	Constructor1(int x,int y)
	{  
	    this(22);	
		System.out.println("two argument");
		
	}

	public static void main(String[] args) {
		
		Constructor1 r= new Constructor1(77,33);

	}

	}
