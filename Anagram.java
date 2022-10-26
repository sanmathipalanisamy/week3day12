package week3day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()==text2.length()) {
			System.out.println("The lengh of the strings are same");
		}
		else{
			System.out.println("The length of the stringsare not same");
		}
		char[] x =text1.toCharArray();
		char[] y=text2.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		if (Arrays.equals(x, y)) {
			System.out.println("Both the arrays has same valaue");
		}
		else {
			System.out.println("Both the arrays value are not same");
		}
	}
}


