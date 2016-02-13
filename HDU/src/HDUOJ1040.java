import java.util.*;
public class HDUOJ1040 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		while((n--)!=0){
			int a=input.nextInt();
			int b[]=new int[a];
			for(int i=0;i<a;i++)
				b[i]=input.nextInt();
			Arrays.sort(b,0,a);
			for(int i=0;i<a-1;i++)
				System.out.print(b[i]+" ");
			System.out.println(b[a-1]);
		}
	}
}
