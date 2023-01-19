//PascalCase --->   Sınıflandırma kuralı : Kelimelerin ilk harfi büyük
public class Product {
    private String name;
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitInsStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitInsStock() {
        return unitInsStock;
    }

    public void setUnitInsStock(int unitInsStock) {
        this.unitInsStock = unitInsStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
