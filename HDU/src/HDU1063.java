import java.math.*;
import java.util.Scanner;
public class HDU1063 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	while(input.hasNext()){
		BigDecimal r=new BigDecimal(input.next());
		BigDecimal ans=new BigDecimal("1.0");
		int n=input.nextInt();
		for(int i=1;i<=n;i++){
			ans=ans.multiply(r);
		}
		ans=ans.stripTrailingZeros();
		String a=ans.toPlainString();
		if(a.charAt(0)=='0') a=a.substring(1);
		System.out.println(a);
	}
	}
}
