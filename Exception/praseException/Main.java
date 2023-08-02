package praseException;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the stage event start date and end date");

        // date format as input
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        try {
            String start = sc.nextLine();

            // parse to local date if it is same as pattern / format
            Date d1 = sdf.parse(start);

            String end = sc.nextLine();
            Date d2 = sdf.parse(end);

            // format back to standarad format
            String s = sdf.format(d1);
            String e = sdf.format(d2);

            System.out.println("Start date:" + s + "\nEnd date:" + e);
        } catch (Exception e) {
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
        }

        sc.close();
    }
}