import java.util.*;
public class Education1 {
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	while(input.hasNext()){
	String a=input.next();
	String c=null,d=null,e=null;
	int x=0,y=0;
	for(int i=0;i<a.length();i++){
		if(a.charAt(i)=='+' || a.charAt(i) == '-'){
			c=a.substring(1,i);
			x=i+1;
		}
	
		if(a.charAt(i)=='='){
			d=a.substring(x+1,i);
			y=i+1;
		}
	}
	e=a.substring(y+1,a.length());
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	}
}
}
