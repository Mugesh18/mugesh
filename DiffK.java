import java.util.Scanner;
public class DiffK {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the difference :");
	int k=sc.nextInt();
	int k1=k*-1;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			 int diff=Math.abs(a[i]-a[j]);
			if(diff==k || diff==k1)
			{
				System.out.println(a[i]+","+a[j]);
				
			}
		}
	}
	
}
}
