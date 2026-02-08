//Types of Constructors
class Student {
    String name;
    int age;

    Student(){
        System.out.println("Default Constructor");
    }
    
    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor");
    }

    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor");
    }
}

