import java.math.BigInteger;
import java.util.*;
public class SHUOJ1561 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		BigInteger a[]=new BigInteger[5005];
		BigInteger b=new BigInteger("1");
		a[1]=b;a[2]=b;
		for(int i=3;i<=5000;i++)
			a[i]=a[i-2].add(a[i-1]);
		while(input.hasNext()){
			int n=input.nextInt();
			System.out.println(a[n]);
		}	
	}
}
