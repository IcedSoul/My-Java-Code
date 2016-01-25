import java.math.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String words[]=new String[10000005];
        int k=0;
        while(input.hasNext()){
        	words[k]=input.next();
        	words[k]=words[k].toLowerCase();
        	k++;
        }
        Arrays.sort(words,0,k);

        for(int i=1;i<k;i++)
        	if(words[i].equals(words[i-1]));
        	else
        	{
        		for(int j=0;j<words[i].length();j++)
        			if(words[i].charAt(j)>='a' && words[i].charAt(j)<='z' )
        				System.out.print(words[i].charAt(j));
        		System.out.println();
        	}
    }
}