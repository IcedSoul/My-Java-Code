import java.util.Arrays;
import java.util.Scanner;
public class SHUOJ1491 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int a[]=new int[1005];
	a[0]=25;a[1]=-25;
	for(int i=2;i<1000;i++)
		a[i]=(a[i-1]*4627+a[i-2]*3581)/100%100-50;
    while(input.hasNext()){
    	int b[]=new int[1005];
    	int n=input.nextInt();
    	for(int i=0;i<n;i++)
    		b[i]=a[i];
    	Arrays.sort(b,0,n);
    	for(int i=0;i<n-1;i++)
    		System.out.print(b[i]+" ");
    	System.out.println(b[n-1]);
    }

}
}
