package ReadandWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EventBO {
    public List<Event> readFromFile(BufferedReader br) {
        List<Event> eventList = new ArrayList<>();
        try {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                eventList.add(new Event(data[0], Integer.parseInt(data[1]), data[2]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eventList;
    }

    void writeFile(List<Event> eventList, FileWriter fr) throws IOException {
        BufferedWriter bw = new BufferedWriter(fr);
        for (Event e : eventList) {
            bw.write(e.getEventName() + "," + e.getAttendeesCount() + "," + e.getOwnerName());
            bw.newLine();
        }
        bw.close();
    }
}
