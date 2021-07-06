package array;

import java.util.Arrays;

public class remove {
	public static void main(String args[])
	{
		int [] arr= new int[] {25,14,56,32,34,12,18,30,10};
		int []arr_new = new int[arr.length-1];
		int j =3;
		for(int i =0,k=0;i<arr.length;i++)
		{
			if(i!=j) {
				arr_new[k]=arr[i];
				k++;
			}
		}
		System.out.println("before deletion"+Arrays.toString(arr));
		System.out.println("after deletion"+Arrays.toString(arr_new));
	}

}
