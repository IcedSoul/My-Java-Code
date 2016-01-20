import java.math.*;
import java.util.Scanner;
public class HDU1042 {
	public static int ans[]=new int[100000];
	private static Scanner input;
	public static void main(String[] args){
	input = new Scanner(System.in);
	while(input.hasNext()){
		int num=input.nextInt(),tempNum=num;
		for(int i=0;tempNum>0;i++){
			ans[i]=tempNum%10;
			tempNum/=10;
		}
		for(int i=0;i<)
	}
	}
}
