import java.util.Scanner;
public class Education2 {
public static long num(int n){
	long ans=0;
	while(n>0){
		int t=n%10;
		if(t==0 || t==6 || t==9) ans+=6;
		if(t==1) ans+=2;
		if(t==2 || t==3 || t==5) ans+=5;
		if(t==4) ans+=4;
		if(t==7) ans+=3;
		if(t==8) ans+=7;
		n/=10;
	}
	return ans;
}
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	long ans=0;
	int a=input.nextInt(),b=input.nextInt();
	for(int i=a;i<=b;i++){
		ans+=num(i);
	}
	System.out.print(ans);
}
}