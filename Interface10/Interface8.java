package Interface10;


interface MyInterface {
public static int num = 100;
public void display();
}
class InterfaceExample implements MyInterface{
public static int num = 10000;
public void display() {
   System.out.println("This is the implementation of the display method");
}
}
public class Interface8 {
public static void main(String args[]) {
InterfaceExample obj = new InterfaceExample();
System.out.println("Value of num of the interface "+MyInterface.num);
System.out.println("Value of num of the class "+obj.num);
obj.display();
}
}

