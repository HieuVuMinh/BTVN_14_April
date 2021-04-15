public class Receipt {
    private Customer customer;
    private double oldIndex;
    private double newIndex;
    private double price;

    public Receipt() {
    }

    ;

    public Receipt(Customer customer, double oldIndex, double newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.price = (newIndex - oldIndex) * 750;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayReceipt() {
        System.out.printf("\nTên khách hàng: %s, địa chỉ: %s, mã công tơ điện: %s, chỉ số cũ: %.0f, chỉ số mới: %.0f\n",
                customer.getName(), customer.getAddress(), customer.getElectricMeterCode()
                , getOldIndex(), getNewIndex());
    }
}
