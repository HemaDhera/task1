package array;

import java.util.Scanner;

public class maxmin {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter the elements in array");
	    int min=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<=9;i++)
	    {
	    	arr[i]=sc.nextInt();
	    	if(arr[i]<min)
	    	{
	    		min=arr[i];
	    	}
	    	if(arr[i]>max)
	    	{
	    		max=arr[i];
	    	}
	    }
	    System.out.println("max is"+max);
	    System.out.println("min is"+min);
	}

}
