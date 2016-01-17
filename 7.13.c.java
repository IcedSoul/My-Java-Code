import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.0");
        while(input.hasNext()){
        	String a=input.nextLine();
        	a=a.toLowerCase();
        	int ans=0;
        	char b[]=a.toCharArray();
        	for(int i=0;i<a.length();i++){
        		if(a.charAt(i)<'a' || a.charAt(i)>'z') 
        			b[i]=' ';
        	}
        	for(int i=0;i<a.length()-1;++i)
        		if(b[i]!=' ' && b[i+1]==' ') ans++;
        	if(b[a.length()-1]!=' ') ans++;
        	System.out.println(ans);
        }
          
    }
}