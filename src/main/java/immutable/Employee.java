package immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Employee {

    private final String name;

    private final Date doj;
    private final List<String> mobile;

    public Employee(String name, Date doj, List<String> mobile) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
    }

    public String getName() {
        return name;

    }

    public Date getDoj() {
        return doj;

    }

    public List<String> getMobile() {
        return mobile;

    }

    @Override
    public String toString() {
        return "Employee{" + "name= '" + name + '\'' +
                ",doj= " + doj +
                ",mobile= " + mobile +
                '}';
    }

    public static  void main(String[] args){

        Date date = new Date();
        List<String> stringList = new ArrayList<>();

        Employee employee = new Employee("sup",date,stringList);

    }
}
