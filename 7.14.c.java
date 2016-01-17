import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.0");
        while(input.hasNext()){
        int n=input.nextInt(),num[]=new int[2005],k=0;
        String s[]=new String[2005],e[]=new String[2005];
        while((n--)!=0){
        	String a=input.next(),b=input.nextLine();
        	int mark=0;
        	for(int i=0;i<k;i++){
        		if(a.equals(s[i])){
        			num[i]++;mark=1;break;
        		}
        	}
        		if(mark==0){
        			s[k]=a;
        			e[k]=a;
        			num[k]=1;
        			k++;
        	}
        }
        char temp[]=new char[2005];
        Arrays.sort(s,0,k);
        for(int i=0;i<k;i++)
        	for(int j=0;j<k;j++)
        		if(s[i].equals(e[j])){
        	      System.out.println(s[i]+" "+num[j]);
        	      break;
        		}
    }
    }
}