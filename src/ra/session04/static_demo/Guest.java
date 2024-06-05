package ra.session04.static_demo;

public class Guest {
    public static void main(String[] args) {
        RA_Website guest1 = new RA_Website();
        guest1.visited();
        System.out.println("Lượt thăm sau khi guest1 thăm: " + guest1.getCntVisited());
        RA_Website guest2 = new RA_Website();
        guest2.visited();
        System.out.println("Lượt thăm sau khi guest2 thăm: " + guest2.getCntVisited());
        RA_Website guest3 = new RA_Website();
        guest3.visited();
        System.out.println("Lượt thăm sau khi guest3 thăm: " + guest3.getCntVisited());
        //Tính tổng 2 số 5 và 10
        System.out.println("Tổng 2 số: "+guest1.sumTwoNumber(5,10));
        System.out.println("Tổng 2 số: "+RA_Website.sumTwoNumber(5,10));
    }
}
