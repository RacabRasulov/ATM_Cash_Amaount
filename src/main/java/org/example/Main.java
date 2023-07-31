package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa meblegi daxil edin");
        int amountEntered = sc.nextInt();

        int yuzAznEskinaz = 100;
        int yuzAZN = amountEntered / yuzAznEskinaz;
        int qaliqMebleg = amountEntered % yuzAznEskinaz;
        System.out.println("100 AZN" + yuzAZN);

        int elliAznEskinza = 50;
        int elliAZN = qaliqMebleg / elliAznEskinza;
        qaliqMebleg = qaliqMebleg % elliAznEskinza;
        System.out.println("50 AZN" + elliAZN);

        int iyirmiAznEskinaz = 20;
        int iyirmiAZN = qaliqMebleg / iyirmiAznEskinaz;
        qaliqMebleg = qaliqMebleg % iyirmiAznEskinaz;
        System.out.println("20 AZN" + iyirmiAZN);

        int onAznEskinaz = 10;
        int onAZN = qaliqMebleg / onAznEskinaz;
        qaliqMebleg = qaliqMebleg % onAznEskinaz;
        System.out.println("10 AZN" + onAZN);

        int besAznEskinaz = 5;
        int besAZN = qaliqMebleg / besAznEskinaz;
        qaliqMebleg = qaliqMebleg % besAznEskinaz;
        System.out.println("5 AZN" + besAZN);

        int birAznEskinaz = 1;
        int birAzn = qaliqMebleg / birAznEskinaz;
        qaliqMebleg = 0;
        System.out.println("1 AZN" + birAzn);
    }
}
