package CompareDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Events");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> oneday = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");
        for (int i = 1; i <= n; i++) {
            String[] line = sc.nextLine().trim().split(",");
            try {
                Date s = sdf.parse(line[1]);
                Date e = sdf.parse(line[2]);
                if (sdf.format(s).equals(sdf.format(e))) {
                    oneday.add(line[0]);
                }
            } catch (Exception e) {
            }
        }
        System.out.println("1-day Events:");
        if (oneday.isEmpty() || oneday.size() == 0) {
            System.out.println("No Events");
        } else {
            for (String e : oneday)
                System.out.println(e);
        }
    }
}
