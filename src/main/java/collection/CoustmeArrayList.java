package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CoustmeArrayList extends ArrayList {

    @Override
    public  boolean add(Object obj){
        if(this.contains(obj)){
            return true ;
        }else{
            return  super.add(obj);
        }
    }

    public  static  void main(String[] args )
    {
        CoustmeArrayList list1 = new CoustmeArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        System.out.println(list1);


        Set<String> set = new HashSet<>();
        set.add("abc");
    }
}
