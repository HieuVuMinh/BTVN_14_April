import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceiptManagement {
    public static final String THÔNG_TIN_KHÁCH_HÀNG = "Nhập thông tin khách hàng";
    public static final String TÊN = "Nhập tên: ";
    public static final String ĐỊA_CHỈ = "Nhập địa chỉ: ";
    public static final String SỐ_CÔNG_TƠ_ĐIỆN = "Nhập số công tơ điện: ";
    public static final String CHỈ_SỐ_CŨ = "Nhập chỉ số cũ:";
    public static final String CHỈ_SỐ_MỚI = "Nhập chỉ số mới:";
    public static final String KHÔNG_TÌM_THẤY_KHÁCH_HÀNG = "Không tìm thấy khách hàng";
    Scanner sc = new Scanner(System.in);
    List<Receipt> receiptList = new ArrayList<>();

    public ReceiptManagement() {
        Customer customer1 = new Customer("Hiếu1", "Bali, Indonesia", "H1");
        Customer customer2 = new Customer("Hiếu2", "Rome", "H2");
        Customer customer3 = new Customer("Hiếu3", "Paris", "H3");

        Receipt receipts1 = new Receipt(customer1, 15, 20);
        receiptList.add(receipts1);
        Receipt receipts2 = new Receipt(customer2, 10, 25);
        receiptList.add(receipts2);
        Receipt receipts3 = new Receipt(customer3, 14, 22);
        receiptList.add(receipts3);
    }


    //Hiển thị danh sách hóa đơn khách hàng
    public void displayReceiptManagement() {
        for (int i = 0; i < receiptList.size(); i++) {
            Receipt list = receiptList.get(i);
            list.displayReceipt();
        }
    }

    //Nhập vào các thông tin cho n hộ sử dụng điện
    public void addReceiptManagement() {
        //Nhập thông tin khách hàng
        Customer customer = inputInfoCustomer();
        //Nhập thông tin hóa đơn
        Receipt receipt = inputInfoReceipt(customer);
        //add vào mảng
        receiptList.add(receipt);
    }

    private Receipt inputInfoReceipt(Customer customer) {
        System.out.println(CHỈ_SỐ_CŨ);
        double oldIndex = sc.nextDouble();
        System.out.println(CHỈ_SỐ_MỚI);
        double newIndex = sc.nextDouble();
        Receipt receipt = new Receipt(customer, oldIndex, newIndex);
        return receipt;
    }

    private Customer inputInfoCustomer() {
        System.out.println(THÔNG_TIN_KHÁCH_HÀNG);
        sc.nextLine();
        System.out.println(TÊN);
        String name = sc.nextLine();
        System.out.println(ĐỊA_CHỈ);
        String address = sc.nextLine();
        System.out.println(SỐ_CÔNG_TƠ_ĐIỆN);
        String electricMeterCode = sc.nextLine();
        Customer customer = new Customer(name, address, electricMeterCode);
        return customer;
    }

    //Tính số tiền phải trả cho mỗi hộ dân
    public void receiptPrice(String electricMeterCode) {
        int k = -1;
        int count = -1;
        for (int i = 0; i < receiptList.size(); i++) {
            count++;
            Receipt meterCode = receiptList.get(i);
            String code = meterCode.getCustomer().getElectricMeterCode();
            if (code.equals(electricMeterCode)) {
                k = 1;
                break;
            }
        }
        if (k == -1){
            System.out.println(KHÔNG_TÌM_THẤY_KHÁCH_HÀNG);
        }else  {
            double priceHasPay =  receiptList.get(count).getPrice();
            System.out.printf("Số tiền khách hàng phải trả: " + priceHasPay + "USD\n");
        }
    }
}
