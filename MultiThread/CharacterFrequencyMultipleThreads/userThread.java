import java.util.TreeMap;

class userThread extends Thread {

    private String line;
    private String result;

    userThread(String line) {
        setLine(line);
        setResult("");
    }

    void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public void run() {
        TreeMap<Character, Integer> hs = new TreeMap<>();

        for (int i = 0; i < line.length(); i++) {
            hs.put(line.charAt(i), hs.getOrDefault(line.charAt(i), 0) + 1);
        }

        for (Character ch : hs.keySet()) {
            result += ch.toString() + ":" + hs.get(ch) + " ";
        }

        result.trim();
    }

}
