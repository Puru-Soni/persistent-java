package removeRange;

class User {
    // Your code here
    private String name;
    private String contactNumber;
    private String userName;
    private String mail;

    public User(String name, String contactNumber, String userName, String mail) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.userName = userName;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    void display() {
        System.out.println(this.getName() + "                " + this.getContactNumber() + "      " + this.getUserName()
                + "            " + this.getMail());
    }

}