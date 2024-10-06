package fundamentals;

public class StringObjects {

    String s1 = new String("suprio das");

    // 1 object -> new -> heap
    // 2 object -> literal -> scp(String constant pool area )

    String s2 = "sup";

    // 1 object
    // it will not create the object

   // System.out.println(s1.intern().hashcode() == s2.hashcode);

    //intern method used to get reference from scp


}
