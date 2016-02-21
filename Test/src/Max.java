import java.util.*;
public class Max {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int x=input.nextInt(),y=input.nextInt();
		int z=x;
		if(y>z) z=y;
		System.out.print(z);
	}
}
