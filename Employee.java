abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void work();
    abstract double calculateSalary();    
}

class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void work() {
        System.out.println(name + " is writing code.");
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
