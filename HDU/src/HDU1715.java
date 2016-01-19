import java.math.*;
import java.util.Scanner;
public class HDU1715 {
	private static Scanner input;
	public static void main(String[] args){
	input = new Scanner(System.in);
	int n=input.nextInt();
	BigInteger a[]=new BigInteger[1001];
	BigInteger s=new BigInteger("1");
	a[1]=s;a[2]=s;
	for(int i=3;i<=1000;i++){
		a[i]=a[i-1].add(a[i-2]);
	}
	while((n--)!=0){
		int b=input.nextInt();
		System.out.println(a[b]);
	}
	}
}
