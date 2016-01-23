import java.math.BigInteger;
import java.util.*;
public class SHUOJ1893 {
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int t=input.nextInt();
	while((t--)!=0){
		BigInteger a=new BigInteger(input.next());
		BigInteger b=new BigInteger(input.next());
		System.out.println(a.multiply(b));
	}
}
}
