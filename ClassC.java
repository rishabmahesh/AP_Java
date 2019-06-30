import java.util.*;

public class ClassC implements ClassA , ClassB{

	
		//calling super class method
		public void doSomething()
		{
		    System.out.println("I am in class C");

	         }
	         
	         public void methodA()
	         {
	            System.out.println("Printing Method A"); 
	           }
	           
	         public void methodB()
	         {
	            System.out.println("Printing Method B"); 
	           }

}