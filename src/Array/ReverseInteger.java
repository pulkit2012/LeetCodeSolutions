package Array;

import java.util.Scanner;

public class ReverseInteger {
    static int reverser(int x) {
        long reverse=0;
        int y=x;
        boolean nFlag=false;
        if(x<0){
            nFlag=true;
            y=Math.abs(x);
        }
        while(y>0){
            reverse=reverse*10+y%10;
            y=y/10;
        }

        if(nFlag)
            reverse=-1*reverse;

        if(reverse>2147483647 || reverse<-2147483648)
            return 0;


        return (int)reverse;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(reverser(a));
    }
}
