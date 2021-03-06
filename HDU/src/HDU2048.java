import java.text.DecimalFormat;
import java.util.*;
 
public class HDU2048 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#0.00");
        double ans[]=new double[25];
        ans[1]=0;ans[2]=1;
        double v[]=new double[25];
        v[2]=2;v[1]=1;
        for(int i=3;i<=20;i++){
        	v[i]=v[i-1]*i;
        	ans[i]=(ans[i-1]+ans[i-2])*(i-1);
        }
        int t=input.nextInt();
        while((t--)!=0){
            int n=input.nextInt();
            double xx=ans[n]*100/v[n];
            System.out.println(df.format(xx)+"%");
        }
         
    }
 
}
