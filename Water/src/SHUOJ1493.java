import java.util.Arrays;
import java.util.Scanner;
public class SHUOJ1493 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int t=input.nextInt();
	while((t--)!=0){
		int n=input.nextInt();
		int a[][]=new int[105][105];
		int min[]=new int[105],max[]=new int[105];
		for(int i=0;i<105;i++){
			min[i]=1000000000;
			max[i]=-1000000000;
		}
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				a[i][j]=input.nextInt();
				if(a[i][j]>max[i]) max[i]=a[i][j];
				if(a[i][j]<min[j]) min[j]=a[i][j];
			}
		int k=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(max[i]==min[j])
				{
					k=1;break;
				}
			}
			if(k==1)break;
		}
		if(k==1) System.out.println("YES");
		else System.out.println("NO");
	}

}
}
