package mergesort;

public class MergeSort {



public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] inputarray= {15,86,25,78,52,415};
	int length=inputarray.length;
	System.out.println("before ");
	for(int el:inputarray) {
		System.out.print(el+" ");
		}
	mergesort(inputarray);
	System.out.println();
	System.out.println("after");
	for(int el:inputarray) {
	System.out.print(el+" ");
	}
	

}

private static void mergesort(int[] inputarray) {
	int length=inputarray.length;
	// TODO Auto-generated method stub
	if(length<2)
	{
		return;
	}
	int midIndex=length/2;
	int[] leftarray=new int[midIndex];
	int[] rightarray=new int[length-midIndex];
	
	for (int i=0;i<midIndex;i++)
	{
		leftarray[i]=inputarray[i];
	}
	for(int i=midIndex;i<length;i++)
	{
		rightarray[i-midIndex]=inputarray[i];
	}
	mergesort(leftarray);
	mergesort(rightarray);
	merge(inputarray,leftarray,rightarray);
	
	
}

private static void merge(int[] inputarray,int[] leftarray,int[]rightarray) {
	// TODO Auto-generated method 
	int leftsize=leftarray.length;
	int rightsize=rightarray.length;
	int i=0,j=0,k=0;
	while(i<leftsize && j<rightsize)
	{
		if(leftarray[i]<=rightarray[j])
		{
			inputarray[k]=leftarray[i];
			i++;
		}
		else
		{
			inputarray[k]=rightarray[j];
			j++;
		}
		k++;
	}
	while(i<leftsize)
	{
		inputarray[k]=leftarray[i];
		i++;
		k++;
	}
	while(j<rightsize)
	{
		inputarray[k]=rightarray[j];
		j++;
		k++;
	}
	
	
	
	
	
}

}




