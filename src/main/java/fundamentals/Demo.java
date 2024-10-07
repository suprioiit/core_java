package fundamentals;

public class Demo {
    private final int  a= 10;

    public  void m1(){

        try{
            System.out.println("try block ");
        }finally {
            System.out.println("finally block ");
        }

    }
    // try with finally or try catch finally , usually we use FINALLY for  jdbc connection stram open we need it to clea those stream ,
    // for jdbc its
    @Override
    protected void finalize() throws  Throwable{
        System.out.println("finalize method called");
    }
    public static void main(String[] args)
    {
        Demo demo = new Demo();
        demo.m1();
        demo = null;
        System.gc();

    }

    // finalize method will be called if object is null and if you run System.gc()
}
