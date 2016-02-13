import java.util.Scanner;
public class SHUOJ1141 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while((t--)!=0){
        	String a=input.next();
        	if(a.length()<8 || a.length()>16){
        		System.out.println("NO");
        	}
        	else{
        		int b=0,c=0,d=0,e=0;
        		for(int i=0;i<a.length();i++){
        			if(a.charAt(i)>='A' && a.charAt(i)<='Z')
        				b=1;
        			if(a.charAt(i)>='a' && a.charAt(i)<='z')
        				c=1;
        			if(a.charAt(i)>='0' && a.charAt(i)<='9')
        				d=1;
        			if(a.charAt(i)=='~' ||a.charAt(i)=='!' ||a.charAt(i)=='@' ||a.charAt(i)=='#'||a.charAt(i)=='$'||a.charAt(i)=='%'||a.charAt(i)=='^')
        				e=1;
        		}
        		if(b+c+d+e>=3)
        			System.out.println("YES");
        		else
        			System.out.println("NO");
        	}
        }
    }
}