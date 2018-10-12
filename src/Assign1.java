import java.util.Scanner;

public class Assign1 {


	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int length=string.length();
		int i,j;

		for(i=0;i<length;i++){

			for(j=0;j<=i;j++){

				System.out.print(string.charAt(j));

				if(j<i){

					System.out.print(" ");
				}
			}
			System.out.println();
		}
		int secLoop=length-1;

		for(i=0;i<length;i++){

			for(j=0;j<=secLoop;j++){


				System.out.print(string.charAt(j));
				if(secLoop>j)
				{
					System.out.print(" ");
				}
			}

			secLoop--;
			System.out.println();

		}





	}

}
