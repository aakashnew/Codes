import java.util.Scanner;

public class Largest {

	
	public static void main(String [] args){
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the value of A- ");
		a=sc.nextInt();
		System.out.println("Enter the value of B- ");
		b=sc.nextInt();
		
		int sum1= a-b;
		int sum2= b-a;
		
		if(sum1>=2){
			
			System.out.println("A is greater by"+ " "+sum1);
		}
		else if(sum2>=2)
		{
			System.out.println("B is greater by"+" "  +sum2);

		}
		else
		{
			System.out.println("INCONCLUSIVE");
		}
		
		
		
		
	}
}
