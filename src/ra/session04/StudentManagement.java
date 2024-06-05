package ra.session04;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //syntax: ClassName objectName = new Constructor(Arguments)
        //1. Khai báo sinh viên 1 mà không khởi tạo bất cứ thông tin gì
        Student student1 = new Student();
        //2. Khai báo sinh viên 2 và khởi tạo mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002","Nguyễn Văn B");
        //3. Khai báo sinh viên 3 và khởi tạo tất cả thông tin sinh viên
        Student student3 = new Student("SV003","Nguyễn Văn C",22,true,"0123456789","HCM",true);
        //4. Nhập thông tin cho sinh viên 1
        Scanner scanner = new Scanner(System.in);
        student1.inputData(scanner);
        //5. Nhập các thông tin còn lại cho sinh viên 2
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 2");
        System.out.println("Nhập vào tuổi sinh viên 2:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên 2:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào số điện thoại của sinh viên 2:");
        student2.setPhone(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên 2:");
        student2.setAddress(scanner.nextLine());
        System.out.println("Nhập vào trạng thái sinh viên 2:");
        student2.setStatus(Boolean.parseBoolean(scanner.nextLine()));

        //6. Tính tổng tuổi của 3 sinh viên
        int sumAge = student1.getAge() + student2.getAge() + student3.getAge();
        System.out.println("Tổng tuổi 3 sinh viên: "+sumAge);

        //IN THÔNG TIN CÁC SINH VIÊN
        //Syntax: objectName.methodName(Arguments)
        System.out.println("THÔNG TIN SINH VIÊN 1:");
        student1.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 2:");
        student2.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 3:");
        student3.displayData();
    }
}
