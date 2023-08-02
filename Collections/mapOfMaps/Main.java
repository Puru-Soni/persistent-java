package mapOfMaps;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // use map of maps
        // Get state vise city count for each input
        // print in sorted order -> sorted map -> treemap

        // TreeMap for lexiographical sort

        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<>();
        // <state , Map< city, count >>

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of address:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the address:");
            String[] data = sc.nextLine().split(",");

            // params - map, state, city
            addMap(map, data[2], data[1]);
        }
        sc.close();

        System.out.println("Number of entries in city/state wise:");
        for (String state : map.keySet()) {
            System.out.println("State: " + state);

            Map<String, Integer> cityMap = map.get(state);
            for (String city : cityMap.keySet()) {
                System.out.println("City:" + city + " Count:" + cityMap.get(city));
            }
        }
    }

    static void addMap(TreeMap<String, TreeMap<String, Integer>> map, String state, String city) {

        // check if specific state in resulting map has already a map for <city, count> or create a new map
        TreeMap<String, Integer> cities = map.getOrDefault(state, new TreeMap<>());

        // update the cities map or it not exist initialize with count 1
        cities.put(city, cities.getOrDefault(city, 0) + 1);

        // update cities map for key-state
        map.put(state, cities);
    }
}