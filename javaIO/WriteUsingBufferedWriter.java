package javaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteUsingBufferedWriter {

	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("C:\\abc.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.close();  
	    System.out.println("Success");  
	    }  
	}  

