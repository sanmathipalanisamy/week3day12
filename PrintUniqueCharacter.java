package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "sai";
		char[] ch=input.toCharArray();
		Set<Character> cha=new HashSet<Character>();
		System.out.print("The given string is -->"+input);
		for(int i=0;i<ch.length;i++) {
			cha.add(ch[i]);
		}
		for(int i=0;i<ch.length;i++) {
			for(int j=(i+1);j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cha.remove(ch[i]);
				}
			}
		}
		
		

	}

}
