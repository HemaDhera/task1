package array;

public class duplicate {
	public static int removedup(int array[],int n) {
		if(n==0 || n==1) {
			return n;
		}
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(array[i]!=array[i+1]) {
				array[j++]=array[i];
			}
		}
		array[j++]=array[n-1];
		return j;
	}
	public static void main(String args[]) {
	int array[]= {12,14,15,18,19,12,45,15};
	int length=array.length;
	length=removedup(array,length);
	for(int i=0;i<length;i++)
		System.out.println(array[i]+" ");
	}
}
