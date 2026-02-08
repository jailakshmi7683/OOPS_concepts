public class Main5 {

    public static void main(String[] args) {
        Employee emp1= new Developer("Alice", 101, 50.0, 160);
        emp1.work();
        System.out.println("Salary: " + emp1.calculateSalary());
    }
    
}
