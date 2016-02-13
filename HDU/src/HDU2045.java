import java.util.*;
import java.math.*;
public class HDU2045 {
	public static long ans[]=new long[55];
    public static long num1=0,num2=1,t1,t2; 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ans[1]=1;
    	ans[2]=2;
    	for(int i=1;i<=48;i++){
    		ans[i+2]=3*num1+2*num2;
    		t1=num1;t2=num2;
    		num1=2*t2+t1;
    		num2=t1;
    	}
        while(input.hasNext()){
            int n=input.nextInt();
            if(n==1)
                System.out.println("3");
            else if(n==2)
                System.out.println("6");
            else
            System.out.println(3*ans[n]);
        }
             
    }
}