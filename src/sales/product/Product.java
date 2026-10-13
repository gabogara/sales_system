package sales.product;

public class Product {
    private final int idProduct;
    private String productName;
    private double productPrice;
    private static int counterProducts = 0;


    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        counterProducts++;
        this.idProduct = ++Product.counterProducts;
    }
    public int getIdProduct() {
        return idProduct;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
