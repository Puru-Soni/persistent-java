package MultiThread.ArticleCount;

public class Article extends Thread {
    // Your code here
    String line;
    Integer count = 0;

    Article(String line) {
        this.line = line;
    }

    void setLine(String line) {
        this.line = line;
    }

    String getLine() {
        return this.line;
    }

    void setCount(Integer count) {
        this.count = count;
    }

    int getCount() {
        return this.count;
    }

    public void run() {
        String[] linedata = this.getLine().trim().split(" ");
        for (String str : linedata) {
            String s = str.toLowerCase();

            if (s.equals("a") || s.equals("an") || s.equals("the")) {
                this.count += 1;
                // System.out.println(s);
            }
        }
    }
}
