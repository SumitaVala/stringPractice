package arrayPracticeExample;

public class arrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayProgram arrobj = new arrayProgram();
		
		  arrobj.arrayCopy(); 
		  arrobj.arrayDuplicate();

		  arrobj.arrReverse();
		  arrobj.findEvenOrOddNofromArray();
		 
		arrobj.findLargestAndSmallestNo();
	}
	
	public static void arrayCopy() {

		int [] arr = new int [] {1,2,3,4,5,6};
		int [] arrcopy = new int[arr.length];
		
		System.out.println("Copy array to another array ");
		for(int i=0; i<arr.length;i++)
		{
			arrcopy[i] = arr[i];
			System.out.println(arrcopy[i]);
		}

	}
	
	
	public static void arrayDuplicate() {
		
		int[] arr1 = new int[] {3,5,4,4,6} ;
		System.out.println("Duplicate element in array list = ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[j]==arr1[i])
				{
					System.out.println(arr1[j]);
				}
			}
			
		}
	}
	

	public static void arrReverse() {
	
		int arr[] = {11,22,33,44,55};
			
			for(int j=arr.length-1;j>=0;j--)
			{
				System.out.println(arr[j]);
			}	
	}
	
	public static void findEvenOrOddNofromArray() {
		
		int arr[] = {4,1,6,4,5,1,2,5,6,15,52,41};
		for(int i=1;i<arr.length;i+=2)
		{
			System.out.println("Even number = "+arr[i]);
		}
		for(int i=0;i<arr.length;i+=2)
		{
			System.out.println("Odd number = "+arr[i]);
		}
	}
	
	public static void findLargestAndSmallestNo() {
		
		
		  int arr[] = {54,66,12,78,45,36,94,22}; 
		  int max =arr[0];
		  
		  for(int i=0;i<arr.length;i++) 
		  { 
			  if(arr[i]>max) 
				  max=arr[i]; 
		  }
		  System.out.println(max);
		  
		   
		
		for(int i=0;i<arr.length;i++) 
		  { 
			  if(arr[i]<max) 
				  max=arr[i]; 
		  }
		  System.out.println(max);
		  
		  } 
	
}
