package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("AGE ASSESSMENT");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("CAT PLAYING");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("AREA");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin genişliğini girin: ");
        double width = scanner.nextDouble();
        System.out.print("Dikdörtgenin yüksekliğini girin: ");
        double height = scanner.nextDouble();
        System.out.print("Dikdörtgenin alanı: " + area(width,height));
        System.out.print("Dairenin yarıçapını girin: ");
        double radius = scanner.nextDouble();
        System.out.println("Dairenin alanı:" + area(radius));


    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23 || !isBarking) {
            return false;
        } else if(isBarking && (hourOfDay < 8 || hourOfDay >= 20)) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int age1, int age2, int age3){

        if ((age1>13 && age1<=19) || (age2>13 && age2<=19) || (age3>13 && age3<=19) ){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int upperLimit = isSummer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }

    public static double area(double width, double height){
        if(width< 0 || height <0){
            System.out.println("Wrong process!");
            return -1;
        } else {
            return width*height;
        }
    }
    public static double area(double radius){
        if(radius <0){
            System.out.println("Wrong radius!");
            return -1;
        } else {
            return radius*radius*Math.PI;
        }
    }
}
