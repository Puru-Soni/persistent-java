import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter the product name");
        String productName = sc.nextLine();

        System.out.println("Enter the supplier name");
        String supplierName = sc.nextLine();

        Product product = new Product(id, productName, supplierName);
        System.out.println(product);
        System.out.println("Invoking getClass() method : " + product.getClass());
    }

}

class Product {
    Long id;
    String productName;
    String supplierName;

    public Product() {
    }

    public Product(Long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return id + " : " + productName + " : " + supplierName;
    }

}
