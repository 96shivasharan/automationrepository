package corrections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInteface {

	public static void main(String[] args) {
		//hashset random array give
//		Set<Integer> set=new HashSet<>();
//		set.add(10);
//		set.add(16);
//		set.add(23);
//		set.add(46);
//		set.add(16);
//		set.add(23);
//		set.add(46);
//		for(int a:set)
//		{
//			System.out.println(a);
//		}
//		
//	}
		
//		Set<Integer> set=new LinkedHashSet<>();
//	set.add(10);
//	set.add(16);
//	set.add(23);
//	set.add(46);
//	set.add(16);
//	set.add(23);
//	set.add(46);
//		for(int a:set)
//	{
//		System.out.println(a);
//	}
//	
		//treeset -sorted
		Set<Integer> set=new TreeSet<>();
		set.add(10);
		set.add(16);
		set.add(23);
		set.add(46);
		set.add(16);
		set.add(23);
		set.add(46);
			/*for(int a:set)
		{
			System.out.println(a);
		}*/
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
}
		
}
