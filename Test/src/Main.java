import java.util.Scanner;
import java.math.*;
public class Main{
	public static int maxn=1000000;
	public static long s[]=new long[maxn],r1[]=new long[maxn],r2[]=new long [maxn];
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
    	while(true){
    		System.out.println("本程序用于寻找满足四个数幂次方两两和相等且彼此和最小\n输入小于等于0或大于等于5的数结束程序\n请输入符合条件的指数：（提示：由于指数运算过大，本程序只适用于小于5的自然数））"); 
    		int n=input.nextInt();                              //提示程序功能输入信息，判断是否在正常值范围内，否则结束程序 
    	    if(n==0||n>=5)break; 
    	    int k=0,r=0,r3=0,r4=0;
    	    long ans=0,r5=0,r6=0;
    	    for(int i=0;i<maxn;i++){                            //由于数组变量为全局变量，所以每次循环需要清空数组 
    	    	s[i]=0;r1[i]=0;r2[i]=0;
    	    }
    	    for(int i=1;k!=1;i++){
    	      for(int j=1;j<=i && k!=1;j++)
    	      {
    	      	s[r]=(long) (Math.pow(i,n)+Math.pow(j,n));
    	      	r1[r]=i;r2[r]=j;
    	      	for(int q=0;q<r;q++){
    	          if(s[r]==s[q]){
    	          	k=1;
    	          	ans=s[r];
    	          	r5=r1[q];r6=r2[q];r3=i;r4=j;
    	          	break;
    			    }
    		      }
    		      r++;
    	       }
    		}
    		System.out.println("满足条件的结果为：");  //输出结果 
    		System.out.println(ans+" = "+r5+"^"+n+" + "+ r6+"^"+n+" = "+r3+"^"+n+" + "+ r4+"^"+n);
    		System.out.println("感谢您使用本程序！");
    	}
     }   
}