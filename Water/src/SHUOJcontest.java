import java.util.*;
public class SHUOJcontest {
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    int n=input.nextInt();
	    while((n--)!=0){
	    	int m=input.nextInt();
	    	int a[]=new int[105];
	    	for(int i=0;i<m;i++)
	    		a[i]=input.nextInt();
	    	Arrays.sort(a,0,m);
	    	if(m==1 || m==2)
	    		System.out.println("yes");
	    	else{
	    		int d=a[1]-a[0];
	    		int mark=1;
	    		for(int i=1;i<m;i++){
	    			if(a[i]-a[i-1]!=d)
	    			{
	    				mark=0;break;
	    			}
	    		}
	    		if(mark==0)
	    			System.out.println("no");
	    		else
	    			System.out.println("yes");
	    	}
	    }
	}
}
