package week3day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input ="payapal India";
		String lowercase = input.toLowerCase();
		char[] ch = lowercase.toCharArray();
		Set<Character> org =new HashSet<Character>();
		Set<Character> dup = new HashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			org.add(ch[i]);
		}
		for(int i=0;i<ch.length;i++) {
			for(int j=(i+1); j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					dup.add(ch[i]);
				}
			}
		}
		if(org.containsAll(dup)) {
			org.removeAll(dup);
		}
		System.out.println("The input before removal of duplicate char-->+input");
		System.out.println("The input after removal of duplicatechar-->"+org);
	}
}
					
				}
			}
		}
		
		
		

	}

}
