import java.math.*;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            int a[]=new int[300005],num[]=new int[300005];
            int n=br.read(),count=0;
            num[0]=0;
            for(int i=1;i<=n;i++){
            	a[i]=br.read();
            	out.write(i+" "+a[i]+"\n");
                out.flush();
            	for(int j=num[count]+1;j<i;j++){
            		if(a[i]==a[j]){
            			count++;
            			num[count]=i;
            		}
            	}
            }
            out.write("lalal");
            out.flush();
            if(count==0){	
            	out.write("-1");
            	out.flush();
            }
            else
            {
            	out.println(count);
            	out.flush();
            	for(int i=0;i<count;i++){
            		out.write((num[i]+1)+" "+num[i+1]+"\n");
            		out.flush();
            	}
            	
            	
            }
        } catch (IOException e) {
        }
		
	}
}