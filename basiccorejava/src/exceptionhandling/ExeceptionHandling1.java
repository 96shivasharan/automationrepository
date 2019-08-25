package exceptionhandling;

public class ExeceptionHandling1 {

	public static void main(String[] args) {
		try {
			String str ="anand";
			System.out.println(str.charAt(8));
			System.out.println(10/0);
		}catch (ArithmeticException e)
		{
			System.out.println("recovrey scenario");
			System.out.println(e.getMessage());
			
		}catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("recovrey scenario");
			System.out.println(e.getMessage());
			
		}
	}

}
