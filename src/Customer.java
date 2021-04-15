public class Customer {
    private String name;
    private String address;
    private String electricMeterCode;

    public Customer (){};
    public Customer(String name, String address, String electricMeterCode){
        this.name = name;
        this.address = address;
        this.electricMeterCode = electricMeterCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getElectricMeterCode() {
        return electricMeterCode;
    }

    public void setElectricMeterCode(String electricMeterCode) {
        this.electricMeterCode = electricMeterCode;
    }

    public void displayCustomer(){
        System.out.printf("Khách hàng tên: %s, số nhà: %s, công tơ điện: %s", getName(), getAddress(), getElectricMeterCode());
    }
}
