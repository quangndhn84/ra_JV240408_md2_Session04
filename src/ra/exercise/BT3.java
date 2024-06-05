package ra.exercise;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Khai báo và nhập giá trị các phần tử mảng 1
        System.out.println("Nhập vào số phần tử của mảng 1:");
        int lengthOfFirstNumbers = Integer.parseInt(scanner.nextLine());
        int[] firstNumbers = new int[lengthOfFirstNumbers];
        for (int i = 0; i < firstNumbers.length; i++) {
            System.out.printf("firstNumbers[%d]=", i);
            firstNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //2. Khai báo và nhập giá trị các phần tử mảng 2
        System.out.println("Nhập vào số phần tử của mảng 2:");
        int lengthOfSecondNumbers = Integer.parseInt(scanner.nextLine());
        int[] secondNumbers = new int[lengthOfSecondNumbers];
        for (int i = 0; i < secondNumbers.length; i++) {
            System.out.printf("secondNumbers[%d]=", i);
            secondNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //3. Khai báo mảng mới (gộp) và chỉ số phần tử nhỏ nhất chưa chứa giá trị của mảng
        int[] newNumbers = new int[firstNumbers.length + secondNumbers.length];
        int currentIndex = 0;
        //4. Duyệt mảng 1 và copy toàn bộ phần tử sang mảng mới
        for (int i = 0; i < firstNumbers.length; i++) {
            newNumbers[currentIndex] = firstNumbers[i];
            currentIndex++;
        }
        //5. Duyệt mảng 2 và copy toàn bộ phần tử sang mảng mới
        for (int i = 0; i < secondNumbers.length; i++) {
            newNumbers[currentIndex] = secondNumbers[i];
            currentIndex++;
        }
        //6. In ra mảng mới
        System.out.println("Các phần tử trong mảng gộp là:");
        for (int element : newNumbers) {
            System.out.printf("%d\t", element);
        }
        System.out.println();
    }
}
