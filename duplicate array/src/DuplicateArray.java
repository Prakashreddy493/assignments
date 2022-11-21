
public class DuplicateArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2,8,1,9,16,57,8,9,1};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if (ar[i]==ar[j])
						{
					System.out.println(ar[i]+"duplicate element found at index"+j);
						}
			}
		}
		

	}
}
