package main.com.windspeeding.Java.Introduction;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Feng on 4/17/2016.
 */
public class StdinAndStdout2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        //Complete this code
        double y = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}
