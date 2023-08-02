package userSearch;

public class User implements Comparable<User> {
    private String username;
    private String bankname;

    public User() {
    }

    public User(String username, String bankname) {
        super();
        this.username = username;
        this.bankname = bankname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Override
    public int compareTo(User u) {
        int hash2 = this.getUsername().hashCode();
        int hash1 = u.getUsername().hashCode();

        return hash1 == hash2 ? 0 : hash1 > hash2 ? 1 : -1;
    }

    @Override
    public boolean equals(Object obj) {
        User u = (User) obj;
        int h1 = u.getUsername().hashCode();
        int h2 = this.getUsername().hashCode();
        return h1 == h2;
    }
}
