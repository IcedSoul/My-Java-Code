import java.util.*;
public class HDUOJ1108 {
	public static int GCD(int a,int b){
		if(a%b==0)
			return b;
		else
			return GCD(b,a % b);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int a=input.nextInt(),b=input.nextInt();
			System.out.println(a*b/GCD(a,b));
		}
	}

}