package CityMap;

import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedHashMap<Address, String> mp = new LinkedHashMap<>();

        System.out.println("Enter the number of address");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address " + (i + 1) + " detail");
            String address = sc.nextLine();
            String[] temp = address.split(",");

            String line1 = temp[0];
            String line2 = temp[1];
            String city = temp[2];
            String state = temp[3];
            int pincode = Integer.parseInt(temp[4]);

            mp.put(new Address(line1, line2, city, state, pincode), city);
        }

        System.out.println("Enter the city to be searched");
        String toSearch = sc.nextLine();

        boolean notFound = true;
        String res = "";
        for (Entry<Address, String> e : mp.entrySet()) {
            if (toSearch.equals(e.getValue())) {
                notFound = false;
                res += e.getKey() + "\n";
            }
        }
        if (notFound)
            System.out.println("Searched city not found");
        else {
            System.out.println("Line 1          Line 2          City            State           Pincode");
            System.out.println(res);
        }
    }
}
