import java.awt.*;

public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int y = 0;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {
                System.out.println(i);
                i++;
                y++;
            } else if (divisibleBy3) {
                System.out.println(i);
                i++;
                y++;

            }else if (divisibleBy5) {
                System.out.println(i);
                i++;
                y++;
            }else {
                i++;
            }


        }
        System.out.println("Total Number of Multiples of 3 and/or 5 under 1000:");
        System.out.println(y);

    }


}
