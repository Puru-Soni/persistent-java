package containsAndTrim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the text from the document");
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine().trim();
        System.out.println("Enter the string to be found in the data");
        String find = sc.nextLine().trim();

        if (document.contains(find)) {
            System.out.println("String is found in the document");
        } else {
            System.out.println("String is not found in the document");
        }
    }
}
