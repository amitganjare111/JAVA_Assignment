package javaIO;

import java.io.FileOutputStream;

public class WriteUsingOutputStream {

	 public static void main(String args[]){    
         try{    
           FileOutputStream fout=new FileOutputStream("abc.txt");    
           fout.write(13345);    
           fout.close();    
           System.out.println("success...");    
          }catch(Exception e)
            {
        	  System.out.println(e);
        	}    
    }    
}  

