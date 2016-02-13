import java.util.*;
public class SHUOJ1231 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int ans=0;
		while(true){
			double a=input.nextDouble();
			if(a==0.0) break;
			double b=Math.pow(a,1.0/3.0);
			if((int)(b+0.5)*(int)(b+0.5)*(int)(b+0.5)==a) ans++;
		}
		System.out.print(ans);
	}
}
