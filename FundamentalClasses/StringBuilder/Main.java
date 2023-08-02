package StringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Item> itemList = new ArrayList<>();
        System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
        for (int i = 1; i <= n; i++) {

            StringBuilder sb = new StringBuilder(sc.nextLine());

            String[] res = new String[4];
            for (int k = 1; k <= 3; k++) {
                int x = sb.indexOf("$");
                res[k - 1] = sb.substring(0, x).toString();
                sb.delete(0, x + 1);
            }
            res[3] = sb.toString();
            itemList.add(new Item(res[0], res[1], Integer.parseInt(res[2]), Integer.parseInt(res[3])));
        }

        System.out.println("Items:");
        for (Item i : itemList) {
            StringBuilder sb = new StringBuilder("");
            sb.append(i.name + "," + i.type + "," + i.cost
                    + ((i.availableQuantity == 0) ? ",Not Available" : ",Available"));
            System.out.println(sb.toString());
        }

    }
}
