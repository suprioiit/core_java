package java8;

public interface Payments {

    public void doTranscation();


    default  void addCoupon(){
        System.out.println("add 5 Rs cashback");
    }

    static  void generatedTranscationReport(){
        System.out.println("generated each transcation report");
    }
}
