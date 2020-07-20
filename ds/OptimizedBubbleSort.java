package ds5;
import java.util.Scanner;

public class array {
	
public static void main(String arr[])
{
Scanner o= new Scanner(System.in);

int n=5,m,i,j,b;
int a[] = new int[n];
for(i=0;i<n;i++)
{
 a[i]=o.nextInt();
}
for(i=0;i<n;i++)
{	int flag = 0;

for(j=0;j<n-i-1;j++)
{ if(a[j]>a[j+1])
{ m = a[j];
a[j] = a[j+1];
a[j+1] =m;
flag++;
}
}
if(flag==0)
	break;
	
}System.out.print("array sorted: ");

for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
