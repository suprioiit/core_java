package Exception;

public class TryCatchFinallyReturnFlow {
    public static  int m1()
    {
        try{
            return 10/0;
        }catch(Exception ex)
        {
            return 2;
        }finally {
            System.exit(0);
            return 7;
        }
    }

    public static  void main(String[] args){
        System.out.println(m1());
    }
}
