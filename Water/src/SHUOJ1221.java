import java.util.*;
public class SHUOJ1221 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int s[][]=new int[1005][1005];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				s[i][j]=input.nextInt();
			}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				System.out.print(s[j][i]+" ");
			}
			System.out.println(s[n-1][i]);
		}
	}
}
