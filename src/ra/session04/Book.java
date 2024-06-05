package ra.session04;

import java.util.Scanner;

public class Book {
    //1. Fields/Attributes/Properties
    private String bookId;
    private String bookName;
    private float price;
    private String publisher;
    private String author;
    private String description;
    private boolean status;
    //2. Constructors

    public Book() {
    }

    public Book(String bookId, String bookName, float price, String publisher, String author, String description, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.publisher = publisher;
        this.author = author;
        this.description = description;
        this.status = status;
    }
    //3. Methods
    //3.1. Getter/Setter

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //3.2. Method
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sách:");
        this.bookId = scanner.nextLine();
        System.out.println("Nhập vào tên sách:");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập vào giá sách:");
        this.price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào nhà xuất bản:");
        this.publisher = scanner.nextLine();
        System.out.println("Nhập vào tên tác giả:");
        this.author = scanner.nextLine();
        System.out.println("Nhập vào mô tả sách:");
        this.description = scanner.nextLine();
        System.out.println("Chọn trạng thái sách:");
        boolean isExit = true;
        do {
            System.out.println("1. Còn hàng");
            System.out.println("2. Hết hàng");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    this.status = true;
                    isExit = false;
                    break;
                case 2:
                    this.status = false;
                    isExit = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn 1-2");
            }
        } while (isExit);
    }

    public void displayData() {
        System.out.printf("Mã sách: %s - Tên sách: %s - Giá: %.1f\n",
                this.bookId, this.bookName, this.price);
        System.out.printf("NXB: %s - Tác giả: %s - Trạng thái: %s\n",
                this.publisher, this.author, this.status ? "Còn hàng" : "Hết hàng");
        System.out.println("Mô tả: " + this.description);
    }
}
