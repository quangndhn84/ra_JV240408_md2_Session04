package ra.session04;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        do {
            System.out.println("**************MENU*************");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Hiển thị thông tin sách");
            System.out.println("3. Hiển thị giá sách");
            System.out.println("4. Thay đổi tên tác giả");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    book.inputData(scanner);
                    break;
                case 2:
                    book.displayData();
                    break;
                case 3:
                    System.out.println("Giá sách: "+book.getPrice());
                    break;
                case 4:
                    System.out.println("Nhập vào tên tác giả cần cập nhật:");
                    book.setAuthor(scanner.nextLine());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn 1-5");
            }
        }while (true);
    }
}
