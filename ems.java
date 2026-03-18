import java.util.Scanner;

// Class Creation
class Employee {
    private String name ;
    private int age ;
    private int id ;
    private float salarly ; 

    // Set the data 
    public void setinfo(String name){
        this.name = name; 
    }

    public void setage(int age){
        this.age = age ;
    }

    public void setid(int id){
        this.id = id ;
    }

    public void setsalarly(float salarly){
        this.salarly = salarly ;
    }
    // Display the data 
    public String getinfo(){
        return name ;
    }

    public int getage(){
        return age ;
    }

    public int getid(){
        return id ;
    }
    public float getsalarly(){
        return salarly ;
    }

}

// Subclass using inheritance
class Manager extends Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class ems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee b1 = new Employee();
        System.out.println("Enter the name of the employee");
        String name = sc.nextLine();
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        System.out.println("Enter the Salarly");
        float salarly = sc.nextFloat();
        int id = (int) (Math.random()*100)  + 1;
        b1.setinfo(name);
        b1.setage(age);
        b1.setsalarly(salarly);
        b1.setid(id);
        System.out.println("The name of the employee is " + b1.getinfo());
        System.out.println("The age of the employee is " + b1.getage());
        System.out.println("The salary of the employee is " + b1.getsalarly());
        System.out.println(b1.getinfo()+ " id will be " + b1.getid());

        // Manager section (inherits Employee)
        sc.nextLine();
        Manager m1 = new Manager();
        System.out.println("\nEnter the name of the manager");
        String managerName = sc.nextLine();
        System.out.println("Enter the age");
        int managerAge = sc.nextInt();
        System.out.println("Enter the salary");
        float managerSalary = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter the department");
        String department = sc.nextLine();
        int managerId = (int) (Math.random()*100) + 101;

        m1.setinfo(managerName);
        m1.setage(managerAge);
        m1.setsalarly(managerSalary);
        m1.setid(managerId);
        m1.setDepartment(department);

        System.out.println("Manager name: " + m1.getinfo());
        System.out.println("Manager age: " + m1.getage());
        System.out.println("Manager salary: " + m1.getsalarly());
        System.out.println("Manager id: " + m1.getid());
        System.out.println("Manager department: " + m1.getDepartment());
    }
    
}
