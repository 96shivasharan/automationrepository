package exceptionhandling;

public class Exceptionhandling3 {

	public static void main(String[] args) throws InterruptedException {
		
           pause2(6000); 
           pause(2000);
           test();
	}
	public static void pause(int seconds) throws InterruptedException
	{
		Thread.sleep(seconds);
	}

	public static void pause2(int seconds) 
	{
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test() throws ArithmeticException
	{
		
	}

}
