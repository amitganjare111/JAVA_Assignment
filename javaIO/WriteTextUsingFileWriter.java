package javaIO;

import java.io.FileWriter;

public class WriteTextUsingFileWriter {

	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("C:\\abc.txt");    
          fw.write("Welcome to javaTpoint.");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }    
}  

