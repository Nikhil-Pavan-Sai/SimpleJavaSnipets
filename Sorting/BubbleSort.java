//implementation of bubble sort in java
import java.util.Scanner;
class BubbleSort
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);//Scanner object
		System.out.println("Enter size of the array");
		int size=obj.nextInt();
		int temp;
		int arr[]=new int[size];//array creation
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();//taking input from user
		System.out.println("Array before sorting");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("Array After sorting");
		for(int i=0;i<size-1;i++)//bubble sort code
		{
			int swap=0;
			for(int j=0;j<size-i-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					swap=1;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if (swap==0)
				break;
		}
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
		
		
		
