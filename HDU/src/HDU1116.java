import java.util.*;

public class HDU1116 {
	public static String str[]=new String[100005];
	public static int t,n,x,y,tree[] = new int[100005];
	public static void opera(int n){
		for(int j=1;j<n;j++){
			int mark=0;
			if(str[j].charAt(str[j].length()-1) == str[n].charAt(0)){
				x=n;y=j;
				merge();
				mark=1;
			}
			if(mark==1)break;
		}
	}
	public static int find(int s){
		int m=s;
		while(tree[m]!=m)
			m=tree[m];
		int q=s;
		while(q!=m){
			int a=tree[q];
			tree[q]=m;
			q=a;
		}
		return m;
	}	
	public static void merge(){
		int t,p;
		t=find(x);
		p=find(y);
		if(t!=p){
			tree[t]=p;
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		t=input.nextInt();
		while(t--!=0){
			n=input.nextInt();
			for(int i=1;i<=n;i++)
				tree[i] = i;
			
			for(int i=1;i<=n;i++){
				str[i]=input.next();
				opera(i);
			}
			int count=0;
			for(int i=1;i<=n;i++){
				if(tree[i]==i)
					count++;
			}
			if(count==1)
				System.out.println("Ordering is possible.");
			else
				System.out.println("The door cannot be opened.");
		}
	}
}
