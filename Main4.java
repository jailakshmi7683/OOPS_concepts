class Main4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice", 20);
        Student student3 = new Student(student2);

        System.out.println("Student 1: " + student1.name + ", Age = " + student1.age);
        System.out.println("Student 2: " + student2.name + ", Age = " + student2.age);
        System.out.println("Student 3: " + student3.name + ", Age = " + student3.age);
    }
}

//constructor is a default method that is called when an object is created
//used to initialize objects