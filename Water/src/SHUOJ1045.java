import java.util.*;
public class SHUOJ1045 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int n=input.nextInt(),count=0;
	int s[]=new int[105];
	for(int i=0;i<n;i++){
		int temp=input.nextInt(),k=0;
		for(int j=0;j<count;j++){
			if(temp==s[j]){
				k=1;break;
			}
		}
		if(k==0){
			s[count]=temp;
			count++;
		}
	}
	Arrays.sort(s,0,count);
	System.out.println(count);
	for(int i=0;i<count-1;i++)
		System.out.print(s[i]+" ");
	System.out.print(s[count-1]);
}
}
