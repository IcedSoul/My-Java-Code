import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		while(input.hasNext()){
			String a=input.nextLine();
			a=a.toUpperCase();
			a=a.replaceAll("-"," ");
			a=a.replaceAll(" THE "," ");
			a=a.replaceAll(" OF "," ");
			a=a.replaceAll(" AND "," ");
			a=a.replaceAll(" FOR "," ");
			a=a.replaceAll(" AN "," ");
			a=a.replaceAll(" A "," ");
			if(a.startsWith("THE "))
				a=a.substring(4, a.length());
			if(a.startsWith("OF "))
				a=a.substring(3, a.length());
			if(a.startsWith("FOR "))
				a=a.substring(4, a.length());
			if(a.startsWith("AND "))
				a=a.substring(4, a.length());
			if(a.startsWith("AN "))
				a=a.substring(3, a.length());
			if(a.startsWith("A "))
				a=a.substring(2, a.length());
			System.out.print("Case "+(++count)+": ");
			System.out.print(a.charAt(0));
			for(int i=1;i<a.length()-1;i++)
				if(a.charAt(i)==' ')
				System.out.print(a.charAt(i+1));
			System.out.println();
		}	
	}
}