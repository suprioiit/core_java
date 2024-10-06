package collection;

public class Student implements  Comparable{

    private int id ;
    private String name ;

    public Student(int id , String name){
        this.id = id ;
        this.name = name ;

    }
    @Override
    public  boolean equlas(Object obj){
        if(this == obj) return  true ;
        if(obj == null || getClass() != obj.getClass()) return  false;
        Student student = (Student) obj;
        return  id == student.id && Object.equlas(name,student.name);
    }

    @Override
    public int compareTo(Object o) {
        if(id == o.hashCode()){

        }
        return 0;
    }
}
