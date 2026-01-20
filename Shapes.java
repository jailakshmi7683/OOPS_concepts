class Shapes{
    String name;
    void printName(){
        System.out.println("This is "+ name);
    }        
}

class Square extends Shapes{
    int side;

    public void getSide(int side){
        this.side = side;
    }

    public int perimeter(int side){
        return 4*side;
    }

    public int area(int side){
        return side*side;
    } 
}

class Rectangle extends Shapes{
    int length;
    int breadth;

    public void getDimensions(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int perimeter(int length, int breadth){
        return 2*(length + breadth);
    }

    public int area(int length, int breadth){
        return length * breadth;
    } 
}

class Circle extends Shapes{
    int radius;
    static double pi = 3.14;

    public void getRadius(int radius){
        this.radius = radius;
    }

    public double perimeter(int radius){
        return 2 * pi * radius;
    }

    public double area(int radius){
        return pi * radius * radius;
    }
}
