
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number of Counters :");
        int counters = Integer.parseInt(br.readLine());

        List<userThread> list = new ArrayList<>();

        for (int i = 1; i <= counters; i++) {
            System.out.println("Enter text for counter " + i + " :");

            String str = br.readLine();
            userThread t = new userThread(str);
            list.add(t);
            t.start();
        }

        for (int i = 1; i <= list.size(); i++) {
            try {
                list.get(i - 1).join();
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
            userThread th = list.get(i - 1);
            System.out.println("Counter " + i + " Result :");
            System.out.println(th.getResult().trim());
        }
    }
}
