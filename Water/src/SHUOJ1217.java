import java.text.DecimalFormat;
import java.util.Scanner;
public class SHUOJ1217 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		while(input.hasNext()){
			double max=-10000005,min=1000005,ans=0;
			for(int i=0;i<7;i++){
				double temp=input.nextDouble();
				if(temp<min) min=temp;
				if(temp>max) max=temp;
				ans+=temp;
			}
			String s=input.next();
			System.out.println(s+" "+df.format((ans-min-max)/5.0));
		}
	}
}
