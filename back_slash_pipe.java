import java.util.Scanner;
public class back_slash_pipe 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r = sc.nextInt();
		System.out.println("ENter the number of symbols :");
		int s = sc.nextInt();
		for(int i =0;i<r*2-1 ;i++)
		{
			if(i%2==0)
			{
				for(int j =0;j<s;j++)
				{
					System.out.print("/\\");
				}
			}
			else
			{
				System.out.print("|");
				for(int j =0;j<s*2-2;j++)
				System.out.print(" ");	
				System.out.print("|");
			}
			System.out.println("\n");
		}

	}

}
