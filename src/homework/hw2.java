package homework;

import java.util.Arrays;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

//[Bài tập] Thêm phần tử vào mảng
//        Luyện tập sử dụng mảng một chiều và cấu trúc lặp.
//         Biết cách sử dụng mảng một chiều và cấu trúc lặp.
//        Trong phần này, chúng ta sẽ phát triển một chương trình cho phép người dùng khai báo
//        mảng mảng số nguyên gồm N phần tử. Nhập một giá trị bất kỳ từ bàn phím và vị trí cần chèn,
//        giá trị này được chèn vào vị trí đó trong mảng.

//       Hướng dẫn :
//Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
//Bước 2: Nhập X là số cần chèn
//Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
//Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
//Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
//Bước 6: In ra mảngn

//        ý tưởng: thực hiện 4 bước đầu theo hướng dẫn
//                b5: tạo 1 mảng mới để gắn giá trị. Cho nó chạy vòng lặp, nếu mà nó chạy đến
//                vòng i == postion -1 thì thêm nó vào mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập độ dài mảng muốn tạo:");
        int arrLength = Integer.parseInt(sc.nextLine());
        int[] arrNumber = new int[arrLength];
        System.out.println("Hãy nhập giá trị cho mảng:");
        for (int i = 0; i < arrLength; i++) {
            arrNumber[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.printf("Mảng hiện tại của bạn đang tạo %d phần tử là: %s%n", arrLength, Arrays.toString(arrNumber));
        System.out.println("Hãy nhập giá trị cần chèn:");
        int addValue = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập vị trí cần chèn:");
        int position = Integer.parseInt(sc.nextLine());
        // Kiểm tra vị trí hợp lệ
        if (position < 0 || position > arrLength) {
            System.out.println("Vị trí chèn không hợp lệ.");
        } else {
            int[] newArr = new int[arrLength + 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < position - 1) {
                    newArr[i] = arrNumber[i];
                } else if (i == position - 1) {
                    newArr[i] = addValue;
                } else {
                    newArr[i] = arrNumber[i - 1];
                }
            }
            System.out.printf("Mảng sau khi chèn phần tử %d vào vị trí %d là: %s%n", addValue, position, Arrays.toString(newArr));

        }
    }
}
