import java.util.Scanner;

public class Question1 {

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
		
		System.out.print("Given Array : ");
		for(int item: arr)
			System.out.print(item + " ");
		System.out.println();
		System.out.println();
		
		System.out.print("O/P : Duplicates present in an Array : ");
		for(int i=0;i<=arr.length-1;i++) {
			int count=0;
			
			for(int j=0;j<=arr.length-1;j++) {
				if(arr[i]==arr[j] && i!=j) 
					count++;
			}
			
			if(count>0)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
