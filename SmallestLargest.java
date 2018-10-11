
public class SmallestLargest {


	public static void main(String [] args){

		int arr[]={6 ,3, 9, 8, 10, 2, 1, 15, 7};
		int i,j;

		

		for(i=0;i<arr.length;i++){
			int smallest=-1;
			int diff=100;

			for(j=0;j<arr.length;j++)
			{
				if (arr[i] < arr[j] &&  arr[j] - arr[i] < diff) 
				{ 
					diff = arr[j] - arr[i]; 
					smallest = j;          
				} 
			} 
		if(smallest==-1)
			
			System.out.print("_"+" ");
		
		else
			System.out.print(arr[smallest]+" ");
		

	}
}
}