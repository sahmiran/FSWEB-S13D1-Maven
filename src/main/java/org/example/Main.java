package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        boolean wakeup1 =  shouldWakeUp (true, 1);

        boolean wakeup2 =  shouldWakeUp (false, 2);

        boolean wakeup3 =  shouldWakeUp (true, 8);

        boolean wakeup4 =  shouldWakeUp (true, -1);

        System.out.println(wakeup1);
        System.out.println(wakeup2);
        System.out.println(wakeup3);
        System.out.println(wakeup4);

        System.out.println("--------------------");
        boolean teen1 = hasTeen(9, 99, 19); //=> true dönmeli.(19 değerinden dolayı)

        boolean teen2 = hasTeen(23, 15, 42); //=> true dönmeli.(15 değerinden dolayı)

        boolean teen3 = hasTeen(22, 23, 34); //=> false dönemli(Hiçbir değer 13-19 arasında değil.)

        System.out.println(teen1);
        System.out.println(teen2);
        System.out.println(teen3);

        System.out.println("--------------------");
        boolean playingcat1 = isCatPlaying(true, 10); //=> false dönmeli(sıcaklık 25-45 arasında olmalıydı)

        boolean playingcat2 = isCatPlaying(false, 36); //=> false dönmeli(sıcaklık 25-35 arasında olmalıydı)

        boolean playingcat3 = isCatPlaying(false, 35); //=> true dönmeli(sıcaklık 25-35 arasında.)

        System.out.println(playingcat1);
        System.out.println(playingcat2);
        System.out.println(playingcat3);

        System.out.println("--------------------");
        double area1 = area(5.0, 4.0); //=> 20.0 değerini dönmeli.

        double area2 = area(-1.0, 4.0); //=> -1 değerini dönmeli.

        System.out.println(area1);
        System.out.println(area2);

        System.out.println("--------------------");
        double area3 = area(5.0); //=> 78.53975 değerini dönmeli

        double area4 = area(-1); //=> -1 değerini dönmeli.

        System.out.println(area3);
        System.out.println(area4);



    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(isBarking && ((clock>=20 && clock<=23) || (clock<8 && clock>=0))){
            return true;
        }
        else {
            {
                return false;
            }
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if ((firstAge<=19 && firstAge>=13) || (secondAge<=19 && secondAge>=13) || (thirdAge<=19 && thirdAge>=13)){
           return true;
       }
       else {
           return false;
       }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer && (temp<=45 && temp>=25)){
            return true;
        } else if (!isSummer && (temp<=35 && temp>=25)) {
            return true;
        }
        else {
            return false;
        }

    }

    public static double area(double width, double height) {
        if(width<0 || height<0){
            return -1;
        }
        else {
            return width*height;
        }
       
    }

    public static double area(double radius) {
        if(radius<0){
            return -1;
        }
        else {
            return radius*radius*Math.PI;
        }
    }
}
