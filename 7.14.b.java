import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.0");
        String a[]=new String[105];
        int k=0,max=0;
        while(input.hasNext()){
        a[k]=input.nextLine();
          max=Math.max(max,a[k].length());
          k++;
        }   
        for(int i=0;i<max;i++){
        	for(int j=k-1;j>=0;j--){
        		if(i<a[j].length())
        			System.out.print(a[j].charAt(i));
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
    }
}