import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(),count=0;
		while((n--)!=0){
			BigInteger a=new BigInteger(input.next());
			BigInteger b=new BigInteger(input.next());
			System.out.println("Case "+ ++count +":\n"+a+" + "+b+" = "+a.add(b));
			if(n>0)
			{
			    System.out.println("1");
			}
	}
	}
}
