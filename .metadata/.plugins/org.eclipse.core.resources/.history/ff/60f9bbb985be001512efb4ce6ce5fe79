import java.util.Scanner;
public class HDU1005 {
	public static int f(int a,int b,int n){
		if(n==1||n==2) return 1;
		else return (a*f(a,b,n-1)+b*f(a,b,n-2))%7;
	}
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	while(input.hasNext()){
		int a=input.nextInt(),b=input.nextInt(),n=input.nextInt();
		if(a==0 && b==0 && n==0) break;
		System.out.println(f(a,b,n));
	}
}
}
