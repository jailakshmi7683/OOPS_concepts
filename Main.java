public class Main {
    public static void main(String[] args){
        Shapes sh1=new Shapes();
        sh1.name="Shape 1";
        sh1.printName();
        sh1.perimeter();
        sh1.area();


        Square sq=new Square();
        sq.name="Square1";
        sq.side=5;
        sq.printName();
        sq.perimeter();
        sq.area();

        Shapes sh2=new Square();
        sh2.name="Square2";
        sh2.printName();
        sh2.perimeter();
        sh2.area();
    }    
}
