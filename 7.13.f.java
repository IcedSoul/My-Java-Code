import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.0");
        int count=0;
        while(input.hasNext()){
          long a=input.nextLong(),l=input.nextLong();
          long b=a;
          if(a==-1 && l==-1) break;
          int ans=0;
          while(a!=1 && a <= l){
        	  if(a%2==0) a=a/2;
        	  else a=a*3+1;
        	  ans++;
          }
          if(a==1) ans++;
          System.out.println("Case "+ ++count +": A = "+b+", limit = "+l+", number of terms = "+ans);
        }
          
    }
}