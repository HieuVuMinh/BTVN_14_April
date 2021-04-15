import java.util.Scanner;

public class Main {

    public static final String SỐ_CÔNG_TƠ_ĐIỆN = "Nhập số công tơ điện: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ReceiptManagement receiptManagement = new ReceiptManagement();
        do {
            menu();
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    receiptManagement.addReceiptManagement();
                    break;
                }
                case 2: {
                    receiptManagement.displayReceiptManagement();
                    break;
                }
                case 3:{
                    sc.nextLine();
                    System.out.println(SỐ_CÔNG_TƠ_ĐIỆN);
                    String id = sc.nextLine();
                    receiptManagement.receiptPrice(id);
                }
            }
        } while (true);
    }

    private static void menu() {
        System.out.println("\n1. Thêm thông tin mới cho hộ sử dụng điện");
        System.out.println("2. Hiển thị thông tin các hộ sử dụng điện");
        System.out.println("3. Hiển thị số tiền phải trả cho hộ dân");
        System.out.println("\nLựa chọn:");
    }
}
