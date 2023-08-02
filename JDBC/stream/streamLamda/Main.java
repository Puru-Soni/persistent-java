package stream.streamLamda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./stream/streamLamda/input.csv"));
        ArrayList<Event> list = new ArrayList<>();
        try {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                list.add(new Event(data[0], data[1], Double.parseDouble(data[2])));
            }

            Event e = new Event();
            e.display(list);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}