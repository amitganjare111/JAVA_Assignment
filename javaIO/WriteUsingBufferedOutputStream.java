package javaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteUsingBufferedOutputStream {

	  public static void main(String[] args) {
	        String s = "This text is written using BufferedOutputStream.";

	        try {
	            FileOutputStream fos = new FileOutputStream("bos.txt");
	            
	            BufferedOutputStream bos = new BufferedOutputStream(fos);

	            byte[] arr = s.getBytes();
	         
	            bos.write(arr);
	           
	            bos.close();
	            fos.close();
	            System.out.println("Data is written to the file.");

	        } 
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}

