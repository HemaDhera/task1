package array;

public class commonnum {
	public static void main(String args[]) {
		int[] arr1 = {2,3,4,6,78,89,30,0};
		int[] arr2 = {21,1,2,6,7,0,89};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j]) {
					
				
				System.out.println(arr1[i]);
				}
			}
		}
	}

}
