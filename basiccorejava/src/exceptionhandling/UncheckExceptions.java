package exceptionhandling;

public class UncheckExceptions {

	
	public static UncheckExceptions obj;
	public static void main(String[] args) {
		String str="shiva";
		
		
	//	System.out.println(str.charAt(6));
		System.out.println(10/0);
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
		at exceptionhandling.UncheckExceptions.main(UncheckExceptions.java:8)*/
		
//obj=new UncheckException();
		
		obj.test();
		/*Exception in thread "main" java.lang.NullPointerException
	at exceptionhandling.UncheckExceptions.main(UncheckExceptions.java:15)*/

		
	}
	public static  void  test()
	{
		
	}

}
