package MultiThread.ArticleCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = sc.nextInt();
        sc.nextLine();

        Article[] th = new Article[n];

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter line " + i);
            th[i - 1] = new Article(sc.nextLine());
            th[i - 1].start();
        }
        sc.close();

        int res = 0;
        for (Article a : th) {
            try {
                a.join();// waiting until thread is running after terminated adding result
            } catch (Exception e) {
            }
            res += a.getCount();
        }

        System.out.println("There are " + res + " articles in the given input");
    }
}
