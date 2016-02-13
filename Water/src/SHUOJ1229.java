import java.math.BigInteger;
import java.util.*;
public class SHUOJ1229 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		BigInteger a,b;
		BigInteger c=new BigInteger("1");
		a=input.nextBigInteger();
		b=input.nextBigInteger();
		while(true){
			if(a.equals(b)) break;
			int k1=0;
			String d=a.toString();
			if(d.length()==1) k1=1;
			else{
				k1=1;
				for(int i=0;i<d.length()/2;i++){
					if(d.charAt(i)!=d.charAt(d.length()-1-i)){
						k1=0;break;
					}
				}
			}
			long e=a.longValue();
			int k2=1;
			if(k1==1){
				for(long i=2;i<=Math.sqrt((double)e);i++){
					if(e%i==0){
						k2=0;break;
					}
				}
			}
			if(k1==1 && k2==1)
				System.out.println(e);
			a=a.add(c);
		}
	}

}
