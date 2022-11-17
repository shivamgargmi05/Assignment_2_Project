import java.util.Scanner;

public class Question6 {

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
		
		System.out.println("Enter the no. of subset array elements :");
		int m=sc.nextInt();
		System.out.println("Enter the subset array elements :");
		int[] srr=new int[m];
		for(int i=0;i<=srr.length-1;i++)
			srr[i]=sc.nextInt();
		System.out.println();
		
		System.out.print("Given Array : ");
		for(int item: arr)
			System.out.print(item + " ");
		System.out.println();
		System.out.println();
		
		System.out.print("Subset Array : ");
		for(int item: srr)
			System.out.print(item + " ");
		System.out.println();
		System.out.println();
		
		int count=0;
		for(int i=0;i<=srr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				if(srr[i]==arr[j]) {
					count++;
					break;
				}
			}
		}
		
		if(count==srr.length)
			System.out.println("O/P : Subset Array is a subset of the given array");
		else
			System.out.println("O/P : Subset Array is not a subset of the given array");
		
	}

}
