public class Customer {
    private int id;
    private String customerNumber;
    private String phone;

    public int getId() {
        return id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public static Customer getInstance() {
        return getInstance();
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
