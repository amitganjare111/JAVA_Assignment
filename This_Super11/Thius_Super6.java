package This_Super11;
//Use this() and super() in methods not in constructor
class AAA{  
   void m(){
	   System.out.println("hello method M");
	   }  
   void n(){  
       System.out.println("hello method N");   
       this.m();  
   }  
}  
public class Thius_Super6 {
   public static void main(String args[]){  
     AAA a=new AAA();  
       a.n();  
}
}  

