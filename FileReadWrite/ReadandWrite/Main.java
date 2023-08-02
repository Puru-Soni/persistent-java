package ReadandWrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileWriter fr = new FileWriter("ReadandWrite/output.txt");

        BufferedReader br = new BufferedReader(new FileReader("ReadandWrite/input.txt"));
        
        EventBO ob = new EventBO();
        
        List<Event> list = ob.readFromFile(br);

        List<Event> noDupliList = new ArrayList<>();

        for (Event e : list) {
            boolean unq = true;
            for (Event el : noDupliList) {
                if (e.getOwnerName().equals(el.getOwnerName())) {
                    unq = false;
                }
            }
            if (unq)
                noDupliList.add(e);
        }

        ob.writeFile(noDupliList, fr);
    }
}
