import java.util.*;
public class HDU1003 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(),count=0,ss=n;
		while((n--)!=0){
			int s=input.nextInt(),k=1,max=-1000,ans1=0,ans2=0;
			int a[]=new int[s+1];a[0]=0;
			for(int i=1;i<=s;i++){
				int t=input.nextInt();
				a[i]=a[i-1]+t;
				if(a[i]>max){
							max=a[i];ans1=k;ans2=i;
						}
				if(a[i]<0) {a[i]=0;k=i+1;}
			}
			count++;
			if(count!=1) System.out.println();
			System.out.println("Case "+count+":");
			System.out.println(max+" "+ans1+" "+ans2);
		}
	}
}
