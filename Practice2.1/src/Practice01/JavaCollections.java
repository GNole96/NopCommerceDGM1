package Practice01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class JavaCollections {
		
		public static void main(String[] args) {
			
			ArrayList l = new ArrayList();
			l.add("Velocity");
			l.add(52);
			l.add(null);
			l.add("Velocity");
			l.add(null);
			l.add("Velo");
			
			System.out.println(l.get(0));
			System.out.println(l.get(1));
			System.out.println(l.get(2));
			System.out.println(l.get(3));
			System.out.println(l.get(4));
			System.out.println(l.get(5));
			
			System.out.println();
			
			LinkedList<String> li =new LinkedList<String>();
			li.add("Deepak");
			li.add("Chandanmalagar");
			li.add(null);
			li.add(null);
			li.add("Deepak");
			
			System.out.println(li.get(0));
			System.out.println(li.get(3));
			System.out.println(li.get(4));
			
			System.out.println();
			
			HashSet hs = new HashSet();
			hs.add("Velocity");
			hs.add(520);
			hs.add(null);
			hs.add("Velocity");
			hs.add(null);
			hs.add(420);
			
			Iterator i = hs.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			System.out.println();
			
			HashMap<Integer,String> hm = new HashMap<Integer,String>();
			hm.put(1, "Deepak");
			hm.put(null, "Nagpur");
			hm.put(null, "Velocity");
			hm.put(2, "Katraj");
			hm.put(3, null);
			hm.put(4, null);
			hm.put(5, "Deepak");
			
			System.out.println(hm.get(1));
			System.out.println(hm.get(2));
			System.out.println(hm.get(3));
			System.out.println(hm.get(4));
			System.out.println(hm.get(5));
			System.out.println(hm.get(null));
			System.out.println(hm.get(null));
		
			
		}

	
	
	
	
}
