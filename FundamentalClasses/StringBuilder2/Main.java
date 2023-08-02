package StringBuilder2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code");
        String inputCode = sc.nextLine();

        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder(inputCode);

        // code
        String code = sb.substring(0, 2).toString();
        if (code.equals("DH")) {
            res.append("DEL");
        } else if (code.equals("MB")) {
            res.append("MUB");
        } else if (code.equals("KL")) {
            res.append("KOL");
        }
        sb.replace(0, 2, "");
        String num = sb.toString();
        if (num.length() < 5) {
            for (int i = 1; i <= 5 - num.length(); i++) {
                res.append("0");
            }
        }
        res.append(num);
        System.out.println("Formatted code");
        System.out.println(res.toString());
    }
}
