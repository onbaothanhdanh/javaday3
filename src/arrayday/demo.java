package arrayday;

import java.util.Scanner;

public class demo {
    //       Khai báo mảng 1 chiều gồm số nguyên gồm 6 phần tử. Thực hiện in menu và thực hiện các chức năng theo menu:
//        1- nhập các phần tử trong mảng
//        2-in các giá trị trong mảng
//        3-tính tổng
//        4-in ra các phần tử chẵn
//        5-in ra các phần tử số lẻ
//        6- thoát.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNumber = new int[6];

        int choice;
        do {
            System.out.println("---------MENU------");
            System.out.println("1. Nhập phần tử cho mảng");
            System.out.println("2. In phần tử trong mảng");
            System.out.println("3. Tổng các phần tử trong mảng");
            System.out.println("4. In ra các phần tử là số chẵn");
            System.out.println("5. In ra các phần tử là số lẻ");
            System.out.println("6. Exit");
            System.out.print("Hãy nhâp lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < arrNumber.length; i++) {
                        System.out.printf("Hãy nhập số của phần tử thứ %d: ", i + 1);
                        arrNumber[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử trong mảng là: ");
                    for (int num : arrNumber) {
                        System.out.printf("%d ", num);
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    for (int num : arrNumber) {
                        sum += num;
                    }
                    System.out.println("Tổng các phần tử trong mảng là: " + sum);
                    break;
                case 4:
                    System.out.println("Các số chẵn trong mảng là:");
                    for (int num : arrNumber) {
                        if (num % 2 == 0) {
                            System.out.printf("%d ", num);
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Các số lẻ trong mảng là:");
                    for (int num : arrNumber) {
                        if (num % 2 != 0) {
                            System.out.printf("%d ", num);
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp, hãy chọn lại từ 1 đến 6");
            }
        } while (choice != 6);
    }
}