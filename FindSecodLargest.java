package week3day2;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecodLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0; i<data.length;i++) {
			
		}
		List<Integer> list = new ArrayList<Integer>(set);
		Integer LargestNnum = Collections.max(list);
		list.remove(LargestNum);
		Integer SecondLargestNum = Collections.max(list);
		System.out.println("The Second largest number is "+SecondLargestNum);
		
		
		

	}

}
