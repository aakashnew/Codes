
public class Assign1 {


	public static void main(String [] args){

		String string="JAVAJ2EE";
		int length=string.length();
		int i,j;

		for(i=0;i<8;i++){

			for(j=0;j<=i;j++){

				System.out.print(string.charAt(j));

			}
			System.out.println();
		}
		int secLoop=6;

		for(i=0;i<length;i++){

			for(j=0;j<=secLoop;j++){


				System.out.print(string.charAt(j));
			}
			secLoop--;
			System.out.println();

		}





	}

}
