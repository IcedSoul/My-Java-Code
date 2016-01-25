import java.util.*;
public class Education1 {
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int x1=input.nextInt(),y1=input.nextInt();
	int x2=input.nextInt(),y2=input.nextInt();
	int temp1=x2-x1,temp2=y2-y1;
	if(temp1<0) temp1=-temp1;
	if(temp2<0) temp2=-temp2;
	System.out.print(Math.max(temp1, temp2));
}
}
