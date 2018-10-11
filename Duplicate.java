
public class Duplicate {

	
	public static void main(String [] args){
		
		
		int arr[]={2,2,4,0,8,2};
		int i,j,count=0;
		int sum=0;
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j])
				{
					sum=arr[i]+arr[j];
					arr[i]=sum;
					arr[j]=0;
				}
				
			}
			
		}
		 for ( i = 0; i < arr.length; i++) 
		        if (arr[i] != 0) 
		            arr[count++] = arr[i]; 
		 
		    while (count < arr.length) 
		        arr[count++] = 0; 
		
		
		
					
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
			
		}
		
	
		
	}
	
	
	
}
