package Date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a date");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String userDate = br.readLine();

        System.out.println("User DATE :" + userDate);
        Date date = sdf.parse(userDate);

        System.out.println("PARSED DATE :" + date);

        String formatted = sdf.format(date);
        System.out.println("Formatted DATE :" + formatted);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 5);
        String output = sdf.format(c.getTime());
        System.out.println(output);
    }
}
