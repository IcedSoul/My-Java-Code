import java.util.Scanner;
public class SHUOJ1512 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int count=0;
    while(input.hasNext()){
    	int n=input.nextInt();
    	int a[]=new int[10005],ans=0;
    	for(int i=0;i<n;i++){
    		a[i]=input.nextInt();
    		for(int j=0;j<i;j++){
    			if(a[j]>a[i]) ans++;
    		}
    	}
    	if(count!=0) System.out.println();
    	System.out.println("Case "+ ++count+":\n"+ans);
    }

}
}
