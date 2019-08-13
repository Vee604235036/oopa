package chap3;

import static chap3.Employee.work;

public class CallEmployee {
    public static void main(String[] args){
    System.out.println("Id : "+Employee.id);
        work();
        
        Employee n = new Employee ();
        System.out.println("Name : "+n.name);
        System.out.println("age : "+n.age);
        n.getSalary();
        
    }
    
}
