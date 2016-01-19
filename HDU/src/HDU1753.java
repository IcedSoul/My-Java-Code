import java.math.*;
import java.util.Scanner;
public class HDU1753 {
	private static Scanner input;

	public static void main(String[] args){
	input = new Scanner(System.in);
	while(input.hasNext()){
		BigDecimal r=new BigDecimal(input.next());
		BigDecimal b=new BigDecimal(input.next());
		BigDecimal ans=new BigDecimal("0.0");
		ans=r.add(b).stripTrailingZeros();
		String a=ans.toPlainString();
		System.out.println(a);
	}
	}
}
