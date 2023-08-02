package CloneMethod;

public class Complaint {
    String complaint;
    Customer customer;

    public Complaint(String complaint, Customer customer) {
        this.complaint = complaint;
        this.customer = customer;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void display() {
        System.out.println("Name : " + this.customer.getName() + " ID : " + this.customer.getId() + " Country : "
                + this.customer.getCountry() + " Complaint : " + this.complaint);
    }
}
