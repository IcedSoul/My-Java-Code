import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.0");
        while(input.hasNext()){
           String a=input.nextLine();
        	   int temp=0;
        	   for(int i=0;i<a.length();i++){
        		   if(a.charAt(i)=='!')
        			   System.out.println();
        		   else if(a.charAt(i)>='0' && a.charAt(i)<='9')
        			   temp+=(int)a.charAt(i)-48;
        		   else if(a.charAt(i)=='b'){
        			   for(int j=1;j<=temp;j++)
        				   System.out.print(' ');
        			   temp=0;
        		   }
        		   else{
        			   for(int j=1;j<=temp;j++)
        				   System.out.print(a.charAt(i));
        			   temp=0;
        		   }
        	   }
        	   System.out.println();
        }
          
    }
}