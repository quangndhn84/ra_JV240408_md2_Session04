package ra.session04;

import java.util.Scanner;

public class Student {
    /*
     * Xây dựng lớp sinh viên gồm:
     * 1. Các đặc điểm
     *   - Mã sinh viên, tên sinh viên, tuổi, giới tính, số đt, địa chỉ, trạng thái
     * 2. Các constructors: 0 tham số, 2 tham số (mã + tên), đầy đủ tham số
     * 3. Các phương thức
     *   - Các phương thức getter/setter cho các thuộc tính
     *   - Phương thức hello: thực hiện chào giảng viên
     *   - Phương thức tính tổng 2 số
     *   - Phương thức hát
     *   - Phương thức inputData: cho phép nhập dữ liệu đối tượng sinh viên
     *   - Phương thức displayData: cho phép hiển thị thông tin sinh viên
     * */
    /*
     * 1. Fields/Attributes/Properties: Thuộc tính mô tả các đặc điểm của đối tượng sinh viên
     * Syntax: Access Modifier + Data type + fieldName
     * Note: Để thể hiện tính bao đóng thì các thuộc tính phải được khai báo là private
     * */
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String phone;
    private String address;
    private boolean status;

    /*
     * 2. Constructor: Hàm tạo sử dụng để khởi tạo các đối tượng
     * Syntax: Access Modifier + ClassName(parameters)
     * Syntax: Datatype + parameterName
     * */
    //Default Constructor
    public Student() {
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, int age, boolean sex, String phone, String address, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }
    /*
     * 3. Method: Mô tả các hành vi của đối tượng
     * - Getter/Setter: Cài đặt truy cập các thuộc tính của đối tượng
     *   + Getter: lấy dữ liệu ra
     *   + Setter: Gán dữ liệu vào
     * - Method:
     * Syntax: Access Modifier + Return DataType + methodName(parameters)
     * */

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void hello(String teacherName) {
        System.out.println("Hello " + teacherName);
    }

    public int sumTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public void sing() {
        System.out.println("Sing a song");
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào số điện thoại:");
        this.phone = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ:");
        this.address = scanner.nextLine();
        System.out.println("Nhập vào trạng thái sinh viên:");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    public void displayData() {
        System.out.printf("Mã SV: %s - Tên SV: %s - Tuổi: %d - Giới tính: %s\n",
                this.studentId, this.studentName, this.age, this.sex ? "Nam" : "Nữ");
        System.out.printf("Phone: %s - Địa chỉ: %s - Trạng thái: %s\n",
                this.phone, this.address, this.status ? "Đang học" : "Nghỉ học");
    }
}
