import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.0");
        int count=0;
        while(input.hasNext()){
          String a=input.nextLine();
          a=a.replaceAll("you", "we");
          System.out.println(a);
        }   
    }
}