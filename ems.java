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

    public void setsalarly(Float salarly){
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
        System.out.println("The name of the employee is " + b1.getage());
        System.out.println("The name of the employee is " + b1.getsalarly());
        System.out.println(b1.getinfo()+ " id will be " + b1.getid());
    }
    
}
