import java.util.Scanner;

// To sort an array using Bubble/Exchange/Sinking Sort Algorithm.

public class Question3 {

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
			for(int j=0;j<arr.length-1-i;j++) {
				
				// swapping adjacent elements
				if(arr[j]>arr[j+1]) { 
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Array after sorting : ");
		for(int item: arr)
			System.out.print(item + " ");
		System.out.println();
		
	}

}
