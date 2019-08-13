package chap3;

public class Employee {
    static int id = 1001;
    String name = "Nalinee";
    int age = 35;
    
    static void work(){
        System.out.println("work()");
    }
    void getSalary(){
        System.out.println("getSalary()");
    }
    
    public static void main(String[] args){
        System.out.println("Id : "+id);
        work();
        
        Employee em = new Employee ();
        System.out.println("Name : "+em.name);
        System.out.println("age : "+em.age);
        em.getSalary();
        
        
    }
}
