import java.util.*;
import java.math.*;
public class SHUOJ1685 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		while(true){
			BigInteger s;
			BigInteger w=new BigInteger("1");
			BigInteger a=new BigInteger(input.next());
			BigInteger b=new BigInteger(input.next());
			if(a.toString().charAt(0)=='0' && b.toString().charAt(0)=='0') break;
			int ans=0;
			int num=0;
			for(s=a;!s.equals(b.add(w));s=s.add(w)){
				num++;
				String sb=s.toString();
				for(int i=sb.length()-1;i>=0;i--){
					if(sb.charAt(i)=='4'){
						ans++;break;
					}
					if(sb.charAt(i)=='3'){
						if(i!=0){
							if(sb.charAt(i-1)=='1'){
								ans++;
								break;
							}
						}
					}
				}
			}
			System.out.println(num-ans);
		}
	}

}
