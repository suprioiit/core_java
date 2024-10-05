package java8;

public class PhonePay implements Payments {

    @Override
    public void doTranscation() {
        System.out.println("Phonepe Transcation");
    }

    @Override
    public void addCoupon() {
        System.out.println("10 cashback okay ");
    }

}
