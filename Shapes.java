class Shapes{
    String name;
    void printName(){
        System.out.println("This is a Shape");
    }
    void perimeter(){
        System.out.println("Perimeter of Shapes");
    }

    void area(){
        System.out.println("Area of Shapes");
    }
}

class Square extends Shapes{
    int side;

    @Override
    void perimeter(){
        System.out.println("Perimeter of Square");
    }

    @Override
    void area(){
        System.out.println("Area of Square");
    }
}




