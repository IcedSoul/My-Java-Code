import java.math.BigInteger;
import java.util.*;
public class SHUOJX{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		BigInteger ans[][]=new BigInteger[5005][5005];
		BigInteger c=new BigInteger("1");
		while(true){
		int n=input.nextInt(),m=input.nextInt();
		for(int i=0;i<=m;i++) ans[0][i]=c;
		for(int i=0;i<=n;i++) ans[i][0]=c;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				ans[i][j]=ans[i-1][j].add(ans[i][j-1]);
				System.out.print(ans[i][j]+" ");}
			System.out.println();
		}
		}
	}
}