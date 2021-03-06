import java.util.*;
public class SHUOJ1225{
    public static boolean IsLeapYear(int a){
        if(a%4!=0)return false;
        else{
            if(a%400==0) return true;
            else{
                if(a%100==0) return false;
                else return true;
            }
        }
    }
    public static int days(int a){
        if(IsLeapYear(a)) return 366;
        else return 365;
    }
    public static int md(int b,int a){
        switch(a){
            case 1: return 31;
            case 2: 
                if(IsLeapYear(b)) 
                    return 29; 
                else
                    return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
        }
        return 0;
    }
     
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    while(input.hasNext()){
    	String a=input.next();
    	int y=1000*((int)(a.charAt(0))-48)+100*((int)(a.charAt(1))-48)+10*((int)(a.charAt(2))-48)+((int)(a.charAt(3))-48);
    	int m;
    	if(a.charAt(6)=='/')
    		m=(int)(a.charAt(5))-48;
    	else
    		m=10*((int)(a.charAt(5))-48)+(int)(a.charAt(6))-48;
    	int d;
    	if(a.charAt(a.length()-2)=='/')
    		d=(int)a.charAt(a.length()-1)-48;
    	else
    		d=(int)a.charAt(a.length()-1)-48+10*((int)a.charAt(a.length()-2)-48);
    	int ans=0;
        for(int i=1;i<m;i++){
        	ans+=md(y,i);
    	}
        System.out.println((ans+d));
    }
    }
}