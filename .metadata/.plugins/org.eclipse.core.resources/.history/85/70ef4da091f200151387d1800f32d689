import java.util.*;

public class Statistics {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String a=input.next();
			String c=input.next();
			String b;
			int ans=0;
			int k=c.length()-1,i=0,t=0;
			while(k>i+1){
				t=(k+i)/2;
				b=c.substring(0,t+1);
				if(a.contains(b)){
					i=t;
				}
				else{
					k=t;
				}
			}
			System.out.println(k);
		}
	}
}
