import java.util.*;
public class SHUOJ1878 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(),m=input.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=input.nextInt();
		for(int i=0;i<m;i++){
			int b=input.nextInt();
			int c=Arrays.binarySearch(a, b);
			if(c>=0 &&c<n)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
