package Exception14;

import java.lang.reflect.Method;

public class NoSuchMethodException14 {

	 public static void main(String[] args) {
		    try {
		      Class c = Class.forName("java.lang.String");

		      Class[] params = new Class[1];
		      Method m = c.getDeclaredMethod("sampleMethod", params);
		    } catch (ClassNotFoundException e) {
		      System.out.println("Exception1: " + e);
		    } catch (NoSuchMethodException e) {
		      System.out.println("Exception2: " + e);
		    }

		    System.out.println("Program finished");
		  }
		}

