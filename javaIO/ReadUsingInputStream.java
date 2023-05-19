package javaIO;

import java.io.FileInputStream;

public class ReadUsingInputStream {

	 public static void main(String args[]){    
	       try{    
	          FileInputStream fin=new FileInputStream("testout.txt");    
	          int i=fin.read();  
	           System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }   
	}

