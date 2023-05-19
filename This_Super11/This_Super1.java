package This_Super11;

/* Print the fields/instance members of the current class using this 
   and without using object */

class Student{  
  int rollno;  
  String name;  
  float fee;  
 Student(int rollno,String name,float fee){  
  this.rollno=rollno;  
  this.name=name;  
  this.fee=fee;  
 }   
 void display(){System.out.println(rollno+" "+name+" "+fee);}  
 }  
  
public class This_Super1 {
 public static void main(String args[]){  
  Student s1=new Student(111,"Amit",512f);  
  Student s2=new Student(122,"sumit",612f);  
   s1.display();  
   s2.display();  
 }
}
   