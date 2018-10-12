import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		String[] newArray = string.split(" ");
		for(String newStr : newArray)
		{
			String reverse = "";	
			for(int i = newStr.length() - 1; i >= 0; i--)
			{
				reverse = reverse + newStr.charAt(i);
			}
			if (newStr.equals(reverse) && newStr.length()>1)
			{
				System.out.print("");
			}
			else
			{
				System.out.print(newStr + " ");
			}
		}
		

	}

}





