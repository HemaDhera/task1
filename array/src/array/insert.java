package array;
import java.util.Scanner;
public class insert {
	public static void main(String[] args) 
    {
        int n, pos, x;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the position:");
        pos = s.nextInt();
        System.out.println("Enter the element  to insert:");
        x = s.nextInt();
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}
