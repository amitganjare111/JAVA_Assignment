package AbstractClass9;

abstract class Ab1 {

	abstract void AbstractMethod();
	
	 void nonAbstractMethod() {
		System.out.println("non Abstract method");
	}
}
 class Ab2 extends Ab1{
	 
	 void AbstractMethod() {
		 Ab1 obj = new Ab2();

			obj.nonAbstractMethod();
	 }

	 }

  class Abstract11 {
		 
	public static void main(String[] args) {
		Ab2 obj1 = new Ab2();
		obj1.AbstractMethod();

	}

}

