import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
        	int n=input.nextInt(),m=input.nextInt(),k=input.nextInt();
        	double s[]=new double[m];
        	double b[]=new double[m];
        	for(int i=0;i<n;i++){
        		for(int j=0;j<m;j++){
        			s[j]+=input.nextDouble();
        			b[j]=s[j];}
        	}  		
        	Arrays.sort(s,0,m);
        	int ans[]=new int[k],mark[]=new int[m];
        	Arrays.fill(mark, 0);
        	int p=0;
        	for(int i=m-1;i>=m-k;i--){
        		for(int j=0;j<m;j++)
        			if(s[i]==b[j]&& mark[j]==0)
        				{ans[p++]=j+1;
        				mark[j]=1;
        				break;}
        	}
        	Arrays.sort(ans);
        	for(int i=k-1;i>0;i--){
        		System.out.print(ans[i]+" ");
        	}
        	System.out.println(ans[0]);
        }
     }   
}