package arrayday;

import java.util.Scanner;

public class demo2 {
//    Nhập số dòng row và số cột col của mảng 2 chiều
//    khai báo mảng 2 chiều số nguyên row và col
//            in menu và thực hiện chức năng:
//    1- Nhập giá trị các phần tử mảng
//    2- hiển thị các phần tử trong ma trận
//            3-Tính tổng các giá trị phần tử trong mang là số chẵn
//            4-in ra các phẩn tử chia hết cho 3 và 5
//    5-THOÁT
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hãy nhập số hàng cho mảng");
    int row = Integer.parseInt(sc.nextLine());
    System.out.println("Hãy nhập số cột cho mảng");
    int col = Integer.parseInt(sc.nextLine());
    int[][] arrNumber = new int[row][col];

    int choice;
    do {
        System.out.println("---------MENU------");
        System.out.println("1. Nhập giá trị các phần tử mảng");
        System.out.println("2. hiển thị các phần tử trong ma trận");
        System.out.println("3. Tính tổng các giá trị phần tử trong mang là số chẵn");
        System.out.println("4. in ra các phẩn tử chia hết cho 3 và 5");
        System.out.println("5. Exit");
        System.out.print("Hãy nhâp lựa chọn của bạn: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                System.out.println("Lựa chọn không phù hợp, hãy chọn lại từ 1 đến 6");
        }
    } while (choice != 5);
}
}