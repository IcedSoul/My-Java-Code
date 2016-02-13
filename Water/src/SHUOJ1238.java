import java.util.*;
public class SHUOJ1238 {
	public static boolean isPrime(int x){
		for(int i=2;i<=Math.sqrt((double)x);i++)
			if(x%i==0) return false;
		return true;
	}
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("21");
	for(int i=100;i<199;i++){
		if(isPrime(i))
			System.out.print(i+" ");
	}
	System.out.print("199");
}
}
