package fundamentals;

import java.util.HashSet;
import java.util.Set;

public class Employee {

    private int id ;
    private String name ;

    public Employee()
    {

    }

    public Employee(int id ,String name){
        this.id = id;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public  int hashCode()
    {
        return id ;
    }

    @Override
    public  boolean equals(Object obj){
        Employee employee = (Employee) obj;
        return  this.id == employee.getId() &&  this.name.equals(employee.getName());

    }

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                "name = " +name + '\''+ '}';
    }

    public static  void main(String[] args){
        Employee employee1 = new Employee(101,"Basant");
        Employee employee2 = new Employee(101,"Ba");
        System.out.println("is hashcode same : " +(employee1.hashCode() == employee2.hashCode()));
        System.out.println("is equals() same " + (employee1.equals(employee2)));


        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        System.out.println();

    }
}
