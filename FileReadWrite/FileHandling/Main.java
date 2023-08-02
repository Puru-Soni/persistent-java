package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("FileHandling/input.csv"));
        UserBO obj = new UserBO();
        List<User> list = obj.readFromFile(br);
        if (list.size() == 0 || list.isEmpty())
            System.out.println("The list is empty");
        else
            obj.display(list);
    }
}