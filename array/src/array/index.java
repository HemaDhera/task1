package array;

public class index {
	
	public static void main (String args[])
	{int [] numbers = {4,9,7,3,2,8};
	int element = 8;
	int index= -1;
	
	int i =0;
	while(i <numbers.length) {
		if (numbers[i]==element) {
			index=i;
			break;
		}
		i++;
	}
	System.out.println("Index of "+element+" is : "+index);
	}

}
