package ch.fhnw.acrm.product;

// PG
public class Product {
    private Long id;
    private String name;
    private double price;
    private double palletSize;
    private int amount;
    //empty constructor
    public Product() {
    }
    //all constructor
    public Product(Long id, String name, double price, double palletSize, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.palletSize = palletSize;
        this.amount = amount;
    }
    //constructor without id
    public Product(String name,
                   double price,
                   double palletSize,
                   int amount) {
        this.name = name;
        this.price = price;
        this.palletSize = palletSize;
        this.amount = amount;
    }
    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPalletSize() {
        return palletSize;
    }

    public void setPalletSize(double palletSize) {
        this.palletSize = palletSize;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", palletSize=" + palletSize +
                ", amount=" + amount +
                '}';
    }
}