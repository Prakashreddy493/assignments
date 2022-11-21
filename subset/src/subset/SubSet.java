package subset;

public class SubSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1= {12,5,24,186,94,2,3};
		int[] ar2= {5,24,2};
		
		   if (isSubset(ar1, ar2))
	            System.out.print("arr2[] is subset of arr1[] ");
	        else
	            System.out.print("arr2[] is not subset of arr1[] ");
	}

	private static boolean isSubset(int[] ar1, int[] ar2) {
		// TODO Auto-generated method stub
		int m=ar1.length;
		int n=ar2.length;
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(ar2[i]==ar1[j])
				{
					break;
				}
			}
			if(j==m)
			{
				return false;
			}
		}
		return true;
	}

}
