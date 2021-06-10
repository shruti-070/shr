import java.util.Arrays;
import java.util.Scanner;
class Alpha
{
	void swap(int arr[],int x,int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	void sort(int arr[],int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n-1;i+=2)
		{
			swap(arr,i,i+1);
		}
		for(int e :arr)
		{
			System.out.print(e+" ");
		}
	}
}
public class swap_array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n =sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element of an array :");
		for(int i =0; i< n ;i++)
		{
			arr[i]=sc.nextInt();
		}
	    Alpha a = new Alpha();
	    a.sort(arr, n);
	}

}
