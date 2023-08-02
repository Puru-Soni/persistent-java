package CloneMethod;

class Customer implements Cloneable {
    // Fill your code here
    String name;
    String id;
    String country;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Customer(String name, String id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
