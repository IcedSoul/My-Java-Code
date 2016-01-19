import java.util.*;
public class HDU1004 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	while(input.hasNext()){
		int n=input.nextInt();
		if(n==0) break;
		String a[]=new String[n];
		int num[]=new int[n],max=0;
		for(int i=0;i<n;i++){
			a[i]=input.next();
			num[i]=0;
			for(int j=0;j<=i;j++){
				if(a[i].equals(a[j]))
					num[i]++;
			}
			if(num[i]>max)
				max=i;
		}
		System.out.println(a[max]);
	}
}
}
