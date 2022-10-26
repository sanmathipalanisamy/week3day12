package week3day1;

public class palindrome {

	private static String equals;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="madam";
		String rev=" ";
		char[] ch=S.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
			{
			rev=rev+ ch[i];
			}
		System.out.println("reversed string values is"+rev);
		boolean equal=S.equals(rev);
		System.out.println("The given string is a palindrome "+equals);
	}
}