package ds;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
    int m =0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			int x=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
				{ System.out.println("Found at "+" "+i);
        m++;
        }
		}
    if(m==0)
    System.out.println("No result Found");
	}

}
