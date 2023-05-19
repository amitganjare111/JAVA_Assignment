package Constructor12;

//Apply private, public, protected and default access modifiers to the constructor
public class Constructor3 {

	public Constructor3(){
		System.out.println("No Arguement Constructor");
	}
	private Constructor3(int aa) {
		this();
		System.out.println("One Arguement Constructor");
	}
	protected Constructor3(int a, int b) {
		this(44);
		System.out.print("Two Arguement Constructor");
	}
	
	public static void main(String[] args) {
		
		Constructor3  obj = new Constructor3(12,22);

	}

}
