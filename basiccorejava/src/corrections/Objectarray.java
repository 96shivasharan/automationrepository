package corrections;

import oops.inheritence.Mobile;
import oops.inheritence.Smartphone;
import oops.inheritence.Telephone;

public class Objectarray {

	public static void main(String[] args) {
		
		Telephone p=new Telephone();
		Mobile m=new Mobile();
		Smartphone sm=new Smartphone();
		
		p=m;
		p=sm;
		int a=10;
		String str="shiva";
		boolean flag=true;
		
		Object obj;
		
		obj=m;
		obj=sm;
		obj=a;
		obj=str;
		obj=flag;
				
		
		
	}

}
