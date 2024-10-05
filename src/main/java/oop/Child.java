package oop;

public class Child extends Parent {

    @Override
    public void m1() throws Exception
    {
        System.out.println("Parten m1()");
    }

    public  static void  hello(String[] args) throws Exception {
       Parent parent = new Child();
       parent.m1();

    }
}
