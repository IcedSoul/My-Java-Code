import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.0");
        while(input.hasNext()){
        	int n=input.nextInt();
        	if(n==0) break;
        	String a[]=new String[20];
        	int max=0;
        	String tt=input.nextLine();
        	for(int i=0;i<n;i++){
        		a[i]=input.nextLine();
        		a[i]=a[i].replaceAll(" ", "");
        		max=Math.max(max, a[i].length());
        	}
        	int ans=0;
        	for(int i=0;i<n;i++){
        		ans+=max-a[i].length();
        	}
        	System.out.println(ans);
        }
          
    }
}