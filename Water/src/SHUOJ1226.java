import java.util.*;
public class SHUOJ1226 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int c=0;
    while(input.hasNext()){
    c++;
    int n=input.nextInt(),count=0;
    if(n==0) break;
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
    if(c!=1)
    	System.out.println();
    Arrays.sort(s,0,count);
    System.out.println(count);
    for(int i=0;i<count-1;i++)
        System.out.print(s[i]+" ");
    System.out.println(s[count-1]);
    }
}
}