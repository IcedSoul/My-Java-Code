/*
 * 01��������ȫ���������ر�����׼ģ��
 * Author:ͩСĿ
 * Language:Java
 * date:2016/01/28
 */
import java.util.*;
public class DEMO {
	public static int dp[]=new int[100005],volume;
	public static void ZeroOneBag(int value,int weight){                         //01����
		for(int i=volume;i>=weight;i--)
			dp[i]=Math.max(dp[i],dp[i-weight]+value);
	}
	public static void CompleteBag(int value,int weight){                        //��ȫ����
		for(int i=weight;i<=volume;i++)
			dp[i]=Math.max(dp[i],dp[i-weight]+value);
	}
	public static void MultipleBag(int value,int weight,int number){             //���ر������������Ż���
		if(number*weight>=volume) {  //����������������Ϊ��ȫ����������
			CompleteBag(value,weight);
			return;
		}
		int i=1;
		while(i<=number){            //�������Ż�
			ZeroOneBag(i*value,i*weight);
			number-=i;
			i<<=1;
		}
		ZeroOneBag(number*value,number*weight);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);                                   //������
	}
}
