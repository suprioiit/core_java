package fundamentals;

public class TestImmutableString {
    public static  void main(String[] args){
        String s = "java";

        s.concat("Techie");
        System.out.println(s);
        String password = "pwd";
        password.concat("123");
    }
}
