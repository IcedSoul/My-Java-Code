import java.util.*;
public class SHUOJ1239 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String a=input.next();
			a=a.replaceAll("1", "2");
			a=a.replaceAll("0", "1");
			a=a.replaceAll("2", "0");
			System.out.println(a);
		}
	}

}
