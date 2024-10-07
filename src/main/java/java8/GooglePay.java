package java8;

public class GooglePay  implements  Payments{

    @Override
    public void addCoupon(){
        Payments payments = new GooglePay();
        payments.addCoupon();
    }

    @Override
    public void doTranscation() {

    }
}
