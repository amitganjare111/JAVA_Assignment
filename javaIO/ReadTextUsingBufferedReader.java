package javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextUsingBufferedReader {

	public static void main(String[] args) {
		try 
		{
		BufferedReader bufferedReader = new BufferedReader(new FileReader("Demo.txt"));
		String line;
		line = bufferedReader.readLine();
		System.out.println(line);
		bufferedReader.close();
		}
        catch (IOException e) 
        {
	       e.printStackTrace();
}
}}