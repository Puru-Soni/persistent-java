package DateFormats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
        String inputDate = sc.nextLine();
        Date d = new Date();
        try {
            d = sdf.parse(inputDate);
        } catch (ParseException e) {
            System.out.println(e);
        }

        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM d, yy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");

        String d1 = sdf1.format(d);
        String d2 = sdf2.format(d);
        String d3 = sdf3.format(d);

        System.out.println("Date Format with EEE, MMM d, yy : " + d1 + "\nDate Format with dd.MM.yyyy : " + d2
                + "\nDate Format with dd dd/MM/yyyy : " + d3);
    }
}
