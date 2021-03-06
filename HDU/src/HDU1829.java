import java.util.Scanner;
import java.math.*;
public class HDU1829 {
	public static long c[]=new long[10000005];
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        long n=input.nextLong(),count=0;
        while((n--)!=0){
            long a=input.nextLong(),b=input.nextLong();
            int k=0,temp=1;
            for(int i=0;i<10000005;i++) c[i]=2;
            while((b--)!=0){
                int e=input.nextInt(),d=input.nextInt();
                if(c[e]==2 && c[d]==2){
                    c[e]=1;c[d]=-c[e];
                }
                else if(c[e]==2 && c[d]!=2)
                    c[e]=-c[d];
                else if(c[e]!=2 && c[d]==2)
                    c[d]=-c[e];
                else if(c[e]!=2 && c[d]!=2)
                    if(c[d]==c[e])
                        k=1;
            }
            if(k==1)
                System.out.println("Scenario #"+ ++count+":\nSuspicious bugs found!");
            else
                System.out.println("Scenario #"+ ++count+":\nNo suspicious bugs found!");
            System.out.println();   
        }
    }
}