
import java.math.BigInteger;
import java.util.*;
public class Catalan {
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	BigInteger a=new BigInteger("1");
	BigInteger b=new BigInteger("2");
	BigInteger c=new BigInteger("4");
	BigInteger d=new BigInteger("1");
	BigInteger ans[]=new BigInteger[10005];
	ans[1]=a;
	for(int i=2;i<=10000;i++){
		d=d.add(a);
		ans[i]=ans[i-1].multiply(c.multiply(d).subtract(b)).divide(d.add(a));
	}
	while(input.hasNext()){
	int t=input.nextInt();
	System.out.println(ans[t]);
	}
	}
}
