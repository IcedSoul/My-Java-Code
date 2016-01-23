import java.util.Arrays;
import java.util.Scanner;
public class SHUOJ1224 {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    	int n=input.nextInt();
    	while((n--)!=0){
    		int m=input.nextInt();
    		int s[]=new int[m];
    		for(int i=0;i<m;i++) s[i]=input.nextInt();
    		Arrays.sort(s,0,m);
    		if(m>1){
    		int d=s[1]-s[0],k=0;
    		for(int i=1;i<m;i++){
    			if(s[i]-s[i-1]!=d){
    				k=1;break;
    			}
    		}
    		if(k==0) 
    			System.out.println("yes");
    		else  
    			System.out.println("no");
    		}
    		else
    			System.out.println("yes");
    	}
    }
}
