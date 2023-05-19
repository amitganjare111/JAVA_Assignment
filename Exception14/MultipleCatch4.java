package Exception14;

public class MultipleCatch4 {

 public static void main(String[] args) {  
         
         try{   
        	 String s=null;  
             System.out.println(s.length());  
             // int a[]=new int[5];    
             // a[5]=30/0;   
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }             
  }  
}

