import java.util.*;
public class SHUOJ1506 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
		String a=input.next(),b=input.next();
		int k=0;
		for(int i=0;i<=b.length()-a.length();i++){
			String temp=b.substring(i, i+a.length());
			System.out.println(temp);
			if(a.equals(temp)){
				k=1;break;
			}
		}
		if(k==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	}
}