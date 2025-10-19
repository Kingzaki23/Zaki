public class product{
    public static void main(String[] args) {
        // Create two products
        product p1 = new product("1", "Laptop", 1000.0, 10.0);
        product p2 = new product("2", "Headphones", 200.0, 10.0);

        // Print step-by-step calculations
        System.out.println("Step-by-step calculation for each product:");
        System.out.println("--------------------------------------");
        p1.showDetails();
        p2.showDetails();
    }
    private String id;
    private String name;
    private double price;
    private double discount;

    // Constructor to initialize all attributes
    public product(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    // Method to calculate price after discount
    public double priceAfterDiscount() {
        return price - (price * (discount / 100));
    }

    // Method to calculate final price after adding 5% VAT
    public double finalPrice() {
        double afterDiscount = priceAfterDiscount();
        return afterDiscount + (afterDiscount * 0.05);
    }

    // Display method
    public void showDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: $" + price);
        System.out.println("Price After Discount: $" + priceAfterDiscount());
        System.out.println("Final Price (with 5% VAT): $" + finalPrice());
        System.out.println("--------------------------------------");
    }

}