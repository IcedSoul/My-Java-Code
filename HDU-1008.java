import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			if(n==0) break;
			int a[]=new int[n],ans=0,sta=0;
			for(int i=0;i<n;i++){
				a[i]=input.nextInt();
				if(sta<a[i]) ans+=6*(a[i]-sta);
				else ans+=4*(sta-a[i]);
				ans+=5;
				sta=a[i];
			}
			System.out.println(ans);
		}
	}
}
