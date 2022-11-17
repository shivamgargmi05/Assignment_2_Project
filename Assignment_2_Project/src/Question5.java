import java.util.Scanner;

// To sort an array using Selection Sort Algorithm.

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the no. of array elements :");
		int n=sc.nextInt();
		System.out.println("Enter the array elements :");
		int[] arr=new int[n];
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		System.out.println();
		
		System.out.print("Array before sorting : ");
		for(int item: arr)
			System.out.print(item + " ");
		System.out.println();
		
		for(int i=0;i<=arr.length-1-1;i++) {	
			
			int min_index=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[min_index]>arr[j])
					min_index=j;
			}
			
			int temp=arr[min_index]; // finding minimum element first and then swapping the values
			arr[min_index]=arr[i];
			arr[i]=temp; 
		}
		
		System.out.println();
		System.out.print("Array after sorting : ");
		for(int item: arr)
			System.out.print(item + " ");
		System.out.println();
		
	}

}
