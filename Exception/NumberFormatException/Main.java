package NumberFormatException;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Fill your code here
        System.out.println("Enter the Item type details:");
        System.out.println("Enter the name:");
        String name = br.readLine();
        try {
            System.out.println("Enter the deposit:");
            Double deposit = Double.parseDouble(br.readLine());
            System.out.println("Enter the cost per day:");
            Double costPerDay = Double.parseDouble(br.readLine());
            ItemType item = new ItemType(name, deposit, costPerDay);
            System.out.println(item);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
