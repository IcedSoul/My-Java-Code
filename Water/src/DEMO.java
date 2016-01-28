/*
 * 01背包，完全背包，多重背包标准模板
 * Author:桐小目
 * Language:Java
 * date:2016/01/28
 */
import java.util.*;
public class DEMO {
	public static int dp[]=new int[100005],volume;
	public static void ZeroOneBag(int value,int weight){                         //01背包
		for(int i=volume;i>=weight;i--)
			dp[i]=Math.max(dp[i],dp[i-weight]+value);
	}
	public static void CompleteBag(int value,int weight){                        //完全背包
		for(int i=weight;i<=volume;i++)
			dp[i]=Math.max(dp[i],dp[i-weight]+value);
	}
	public static void MultipleBag(int value,int weight,int number){             //多重背包（二进制优化）
		if(number*weight>=volume) {  //如果满足此条件可视为完全背包问题解决
			CompleteBag(value,weight);
			return;
		}
		int i=1;
		while(i<=number){            //二进制优化
			ZeroOneBag(i*value,i*weight);
			number-=i;
			i<<=1;
		}
		ZeroOneBag(number*value,number*weight);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);                                   //测试略
	}
}
