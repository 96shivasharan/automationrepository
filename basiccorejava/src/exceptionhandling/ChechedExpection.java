package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChechedExpection {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("name");
		 Thread.sleep(600);
		UncheckExceptions.test();
		System.out.println("surname");
		FileInputStream obj=new FileInputStream("");
	}

}
