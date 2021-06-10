import java.util.Arrays;
import java.util.Scanner;

public class prod_minmax 
{
	public static int pro(int a1[],int a2[],int n1,int n2)
	{
		Arrays.sort(a1);
		Arrays.sort(a2);
		return a1[0]*a2[n2-1];
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array :");
		int n1 =sc.nextInt();
		int[] a1 = new int[n1];
		System.out.println("Enter the element of an array :");
		for(int i =0; i< n1 ;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of second array :");
		int n2 =sc.nextInt();
		int[] a2 = new int[n2];
		System.out.println("Enter the element of an array :");
		for(int i =0; i< n2 ;i++)
		{
			a2[i]=sc.nextInt();
		}
		int p =pro(a1,a2,n1,n2);
		System.out.println(p);
	}

}
