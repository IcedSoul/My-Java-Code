import java.math.BigInteger;
import java.util.*;
public class SHUOJ839 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
		BigInteger a=input.nextBigInteger(),b=input.nextBigInteger();
		System.out.println(a+"+"+b+"="+a.add(b));
		}
	}
}
