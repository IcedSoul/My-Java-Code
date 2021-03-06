import java.util.Arrays;
import java.util.Scanner;
public class SHUOJ1732 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int count=0;
	while(input.hasNext()){
		int n=input.nextInt(),v=input.nextInt();
		int dp[]=new int[505],value[]=new int[55],weight[]=new int[55];
		for(int i=0;i<=504;i++) dp[i]=0; 
		for(int i=1;i<=n;i++) value[i]=input.nextInt();
		for(int i=1;i<=n;i++) weight[i]=input.nextInt();
		for(int i=1;i<=n;i++)
			for(int j=v;j>=0;j--)
				if(j>=weight[i]) dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
		System.out.println("Case "+ ++count+":"+dp[v]);
	}

}
}
