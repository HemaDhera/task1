package array;

public class commonarr {
	public static void main(String args[]) {
		String[] arr1 = {"h","g","t","k","l","W"};
		String[] arr2 = {"t","k","m","b","f","x","d","q"};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j])) {
					
				
				System.out.println(arr1[i]);
				}
			}
		}
	}


}
