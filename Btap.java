import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU BAI TAP JAVA =====");
            System.out.println("1. Nhap ten va in ra 'Hello + Ten'");
            System.out.println("2. Khai bao bien luu thong tin ca nhan");
            System.out.println("3. Nhap 2 so nguyen va tinh toan");
            System.out.println("4. Tinh lai suat ngan hang");
            System.out.println("0. Thoat");
            System.out.print("Chon bai tap (0-4): ");
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
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
            System.out.println();
        } while (choice != 0);

        sc.close();
    }

    // Bai 1
    public static void bai1(Scanner sc) {
        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    // Bai 2
    public static void bai2() {
        String name = "Khanh";
        int age = 19;
        double height = 1.78;
        boolean likesProgramming = true;
        char gender = 'M';

        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + height + "m");
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Co thich lap trinh khong? " + likesProgramming);
    }

    // Bai 3
    public static void bai3(Scanner sc) {
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();

        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Tich: " + (a * b));
        if (b != 0) {
            System.out.println("Thuong: " + (a / b));
            System.out.println("Phan du: " + (a % b));
        } else {
            System.out.println("Khong the chia cho 0!");
        }
    }

    // Bai 4
    public static void bai4(Scanner sc) {
        DecimalFormat df = new DecimalFormat("#,###"); 

        System.out.print("Nhap so tien gui (VND): ");
        double tienGui = sc.nextDouble();
        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int soThang = sc.nextInt();

        double tienLai = tienGui * (laiSuatNam / 100) * (soThang / 12.0);
        double tongTien = tienGui + tienLai;

        System.out.println("Tien lai: " + df.format(tienLai) + " VND");
        System.out.println("Tong tien cuoi ky: " + df.format(tongTien) + " VND");
    }
}