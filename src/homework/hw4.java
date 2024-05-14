package homework;

import java.util.Scanner;


public class hw4 {
    public static void main(String[] args) {
//[Bài tập] Tìm phần tử lớn nhất trong mảng hai chiều
//        Luyện tập theo tác với mảng 2 chiều
//        Viết một ứng dụng cho phép người dùng nhập vào một ma trận số thực sau đó tìm
//        ra tọa độ cũng như giá trị của phần tử lớn nhất
//        In ra ma trận
//        Hiển thị ra giá trị lớn nhất trong mảng hai chiều

//        ý tưởng:
//        Tạo biến lưu giá trị lớn nhất và 2 biến để luu tọa độ của nó. Tạm thời coi phần tử đầu tiên là lớn nhất
//        Cho nó chạy qua vòng lặp(2 vòng lòng nhau): nếu phần tử lớn hơn max câp5 nhật max lại + tọa ộ:

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột: ");
        int cols = Integer.parseInt(sc.nextLine());
        double[][] arrMatrix = new double[rows][cols];
        System.out.println("Nhập giá trị cho ma trận:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập giá trị cho phần tử [%d][%d]: ", i, j);
                arrMatrix[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        double max = arrMatrix[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arrMatrix[i][j] > max) {
                    max = arrMatrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Ma trận array vừa tạo:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%.2f ", arrMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.printf("Giá trị lớn nhất là %.2f, tại tọa độ [%d][%d].\n", max, maxRow, maxCol);
    }
}