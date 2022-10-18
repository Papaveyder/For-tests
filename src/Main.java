import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void start () {

        System.out.println ("Hello! There are 4 judges giving their scores!: \nPlease Enter score here from 1 to 10 ->> ");



        Scanner scan = new Scanner(System.in);

//double scores = scan.nexDouble();

        double [] gradeArr = new double [4];

        for (  int x = 0; x<4; x++) {

            gradeArr[x]=scan.nextDouble();
        }

        System.out.println (Arrays.toString(gradeArr));

        double y = 0;

        for (int b = 0; b<4; b++) {

            y+=gradeArr[b];

        }

        y=y/4;

        System.out.println ("Averege Score is:" + y);

    }

    public static void main(String args[]) {

        start();

    }
}