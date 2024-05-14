package homework;

import java.util.Arrays;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
//    [Bài tập] Xoá phần tử khỏi mảng
//        Trong phần này, chúng ta sẽ phát triển một chương trình thực hiện xoá một phần tử được nhập
//        vào từ bàn phím ra khỏi mảng, nếu phần tử đó xuất hiện trong mảng
//
//        Vậy để thực hiện được việc xoá, trước tiên cần tìm xem phần tử đó có xuất
//        hiện trong mảng hay không. Nếu xuất hiện cần chỉ ra vị trí của phần tử đó.
//        Việc xoá một phần tử trong mảng chính là thực hiện ghi đè phần tử đằng sau nó lên chính phần tử cần xoá.


        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập độ dài mảng muốn tao");
        int arrLength = Integer.parseInt(sc.nextLine());
        int[] arrNumber = new int[arrLength];
        System.out.println("Hãy nhập giá trị cho mảng");
        for (int i = 0; i < arrLength; i++) {
            arrNumber[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.printf("Mảng hiện tại của bạn đang tạo %d phần tử là: %s%n ", arrLength, Arrays.toString(arrNumber));
        System.out.println("Hãy nhập phần tử muốn xóa: ");
        int deleteNumberofArr = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (int i = 0; i < arrLength; i++) {
            if (arrNumber[i] == deleteNumberofArr) {
                flag = true;
            }
            if (flag && i < arrLength - 1) {
                arrNumber[i] = arrNumber[i + 1];
            }
        }
        if (flag) {
            arrNumber[arrLength - 1] = 0;
            System.out.printf("Mảng sau khi xóa phần tử %d là: %s%n", deleteNumberofArr, Arrays.toString(arrNumber));
        } else {
            System.out.println("Phần tử muốn xóa không tồn tại trong mảng.");
        }
    }
}

