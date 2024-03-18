import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        /*
        int saturdayFarenheit;
        int sundayFarenheit;
        saturdayFarenheit = 78;
        sundayFarenheit = 81;
        double saturdayCelcius = (5.0/9) * (saturdayFarenheit - 32);
        double sundayCelcius = (5.0/9) * (sundayFarenheit - 32);
        System.out.println("Weekened Averages");
        System.out.println("Saturday: " + saturdayCelcius);
        System.out.println("Sunday: " + sundayCelcius);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int f = input.nextInt();

        System.out.print("Enter a day of the week: ");
        String day = input.next();

        System.out.print("Enter your preffered Celcius label (Celcuis, Centigrade, or C: ");
        String label = input.next();

        double c = (5.0/9) * (f - 32);

        System.out.println(day + " Farenheit: " + f);
        System.out.println(day + " Celsius: " + c);
        System.out.printf("%s Farenheit: %d\n", day, f);
        System.out.printf("%s Celsius: %.1f\n", day, c);

        System.out.printf("%s Farenheit: %d\n", day, f);
        System.out.printf("%s %10s: %.1f\n", day,label, c);

        if (f >= 70 && f <= 90) {
            System.out.println("Yay! Go to park.");
        }
        else {
            System.out.println("Stay home where there’s wi-fi and learn 1331 online");
        }
        */

//        Scanner input = new Scanner(System.in);
//        double[] weekHighs = new double[7];
//        weekHighs[0] = input.nextDouble();

        double[] weekHighs = {80, 70, 90, 77, 67, 87, 98};
        double highSum = 0;
        for (int index = 0; index < weekHighs.length; index++) {
            highSum = highSum + weekHighs[index];
        }

        double averageHighs = highSum / weekHighs.length;
        System.out.printf ( "Average is: %.1f ", averageHighs);




        /*
        String funnyStr = "Computer!Science,!long!walks!on!the!beach";
        int a = funnyStr.indexOf(33);
        int b = funnyStr.indexOf('!'); //chars are converted to Unicode int value
        int c = funnyStr.indexOf("!");
        int d = funnyStr.indexOf("!Science");
        int e = funnyStr.indexOf("!Science,!long");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

         */
        }
}