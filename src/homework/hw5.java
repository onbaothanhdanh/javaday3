package homework;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
//      [Bài tập] Tìm giá trị nhỏ nhất trong mảng
//        Luyện tập sử dụng cấu trúc vòng lặp for
//        Trong phần này, chúng ta sẽ phát triển một chương trình cho
//        phép người dùng khai báo một mảng số nguyên với các giá trị trong mảng
//        được khởi tạo sẵn hoặc được nhập từ bàn phím.Chúng ta sẽ hiển thị mảng đó ra màn hình
//        Và hiển thị giá trị nhỏ nhất trong mảng đó ra màn hình

//  Ý tưởng:
//  tạo biến min. cho phần tử ban đầu là nhỏ nhất
//  duyệt qua vòng lặp, nếu phần tử nhỏ hơn min thì cập nhật lại min:

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int arrLength = Integer.parseInt(sc.nextLine());
        int[] arr = new int[arrLength];

        System.out.println("Nhập giá trị mảng:");
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("Phần tử %d:", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mảng đã nhập:");
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("%d%n", arr[i]);
        }

        int min = arr[0];
        for (int i = 1; i < arrLength; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Giá trị nhỏ nhất là: %d%n", min);
   }
}
