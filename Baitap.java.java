import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU BÀI TẬP JAVA =====");
            System.out.println("1. Nhập tên và in ra 'Hello + Tên'");
            System.out.println("2. Khai báo biến lưu thông tin cá nhân");
            System.out.println("3. Nhập 2 số nguyên và tính toán");
            System.out.println("4. Tính lãi suất ngân hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn bài tập (0-4): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    bai1(sc);
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3(sc);
                    break;
                case 4:
                    bai4(sc);
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
            System.out.println(); 
        } while (choice != 0);

        sc.close();
    }

    // Bài 1
    public static void bai1(Scanner sc) {
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    // Bài 2
    public static void bai2() {
        String ten = "Đức";
        int tuoi = 19;
        double chieuCao = 1.75;
        boolean thichLapTrinh = true;
        char gioiTinh = 'M';

        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + "m");
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Có thích lập trình không? " + thichLapTrinh);
    }

    // Bài 3
    public static void bai3(Scanner sc) {
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        if (b != 0) {
            System.out.println("Thương: " + (a / b));
            System.out.println("Phần dư: " + (a % b));
        } else {
            System.out.println("Không thể chia cho 0!");
        }
    }

    // Bài 4
    public static void bai4(Scanner sc) {
        System.out.print("Nhập số tiền gửi (VND): ");
        double tienGui = sc.nextDouble();
        System.out.print("Nhập lãi suất hàng năm (%): ");
        double laiSuatNam = sc.nextDouble();
        System.out.print("Nhập số tháng gửi: ");
        int soThang = sc.nextInt();

        double tienLai = tienGui * (laiSuatNam / 100) * (soThang / 12.0);
        double tongTien = tienGui + tienLai;

        System.out.println("Tiền lãi: " + tienLai + " VND");
        System.out.println("Tổng tiền cuối kỳ: " + tongTien + " VND");
    }
}
