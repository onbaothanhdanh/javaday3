package homework;


import java.util.Arrays;
import java.util.Scanner;


public class hw3 {
    public static void main(String[] args) {
//[Bài tập] Gộp mảng
//        Luyện tập sử dụng cấu trúc vòng lặp mảng một chiều với còng lặp for
//        Trong phần này, chúng ta sẽ phát triển một chương trinhfcho phép gộp 2 mảng trở thành một mảng thứ 3
//        Chương trình cho phép người dùng nhập giá trị cho các phần tử trong 2 mảng số nguyên cho trước
//        Mảng số nguyên thứ 3 được khai báo có kích thước bằng kích thước của 2 mảng só nguyên đã cho cộng lại với nhau
//        Mảng này sẽ chứa các phần tử trong mảng 1 và 2 chiều

//        ý tưởng:
//        khai báo hai mảng, cho người dùng nhập độ dài 2 mảng, giá trị 2 mảng
//        tạo mảng thứ 3, độ dài bằng 2 mảng kia cộng lại
//        gán giá trị cho mảng 3: chạy dòng lặp cho gán giá trị i mảng 1 vào ,
//        rồi tiếp tục cho chạy vòng for thứ 2 gắn giá trị mảng3[arrlengt1] vào
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng 1: ");
        int arrLength1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập độ dài mảng 2: ");
        int arrLength2 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[arrLength1];
        int[] arr2 = new int[arrLength2];
        System.out.println("Nhập giá trị cho mảng 1:");
        for (int i = 0; i < arrLength1; i++) {
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập giá trị cho mảng 2:");
        for (int i = 0; i < arrLength2; i++) {
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        int[] mergedArr = new int[arrLength1 + arrLength2];

        for (int i = 0; i < arrLength1; i++) {
            mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < arrLength2; i++) {
            mergedArr[arrLength1 + i] = arr2[i];
        }
        System.out.printf("Mảng sau khi gộp %s", Arrays.toString(mergedArr));
    }
}

