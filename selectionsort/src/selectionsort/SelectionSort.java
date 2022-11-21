package selectionsort;
import java.util.*;

	public class SelectionSort {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the length");
			int length=scan.nextInt();
			int[] arr= new int[length];
			for(int i=0;i<length;i++)
			{
				System.out.println("enter the"+i+"element");
				arr[i]=scan.nextInt();
			}
			System.out.println("before sorting");
			for(int a:arr)
			{
				System.out.print(a+" ");
			}
			System.out.println();
			
			selection(arr);
			// TODO Auto-generated method stub

		}

		private static void selection(int[] arr) {
			// TODO Auto-generated method stub
			int n=arr.length;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("after sorting");
			for(int a:arr)
			{
				System.out.print(a+" ");
			}
		}

	}








