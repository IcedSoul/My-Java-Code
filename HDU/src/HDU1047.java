import java.math.*;
import java.util.Scanner;
public class HDU1047 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int n=input.nextInt(),i=0;
	while((n--)!=0){i++;
		BigInteger sum=new BigInteger("0");
		while(true){
			BigInteger temp=new BigInteger(input.next());
			sum=sum.add(temp);
			if(temp.toString().equals("0")) break;
		}
		if(i!=1)System.out.println();
		System.out.println(sum);	
	}
	}
}
