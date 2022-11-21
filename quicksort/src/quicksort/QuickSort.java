package quicksort;
import java.util.*;
class QS{
	public void quickSort(int ar[],int lowIndex , int highIndex)
	{
		if(lowIndex>=highIndex) {
			return;
		}
	
		
		int pivot=ar[highIndex];
		int leftPointer=lowIndex;
		int rightPointer=highIndex;
		while(leftPointer<rightPointer)
		{
			while(ar[leftPointer]<=pivot && leftPointer<rightPointer)
			{
				leftPointer++;
			}
			while(ar[rightPointer] >= pivot && leftPointer<rightPointer)
			{
				rightPointer--;
			}
			swap(ar,leftPointer,rightPointer);
			
		}
		swap(ar,leftPointer,highIndex);
		quickSort(ar,lowIndex,leftPointer-1);
		quickSort(ar,leftPointer+1,highIndex);
		
	}
	public void swap (int[] ar, int index1,int index2)
	{
		int temp=ar[index1];
		ar[index1]=ar[index2];
		ar[index2]=temp;
		
		
	}

}

public class QuickSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		int le=scan.nextInt();
		int[] ar= new int[le];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter the "+i+" element ");
			ar[i]=scan.nextInt();
		}
		scan.close();
		int n=ar.length;
		QS qs=new QS();
		qs.quickSort(ar,0,n-1);
		for(int el:ar)
		{
			System.out.print(el+" ");
		}
		
		

	}

}


