package ra.session04.static_demo;

public class RA_Website {
    private static int cntVisited = 0;

    //Khối static sẽ được chạy trước constructor
    static{
        cntVisited = 10;
    }

    static {
        cntVisited = 20;
    }

    public int getCntVisited() {
        return cntVisited;
    }

    public void setCntVisited(int cntVisited) {
        this.cntVisited = cntVisited;
    }

    public void visited(){
        cntVisited++;
    }

    //Các phương thức static chỉ có thể gọi các phương thức static khác
    public static int sumTwoNumber(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
