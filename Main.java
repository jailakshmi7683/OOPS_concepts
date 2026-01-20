import java.util.*;
public class Main {
    public static void main(String[] args){
        System.out.println("Enter the shape name:");
        Scanner sc=new Scanner(System.in);
        String shape= sc.nextLine();

        switch(shape){
            case "Square": Square sq=new Square();
            sq.name="Square";
            sq.printName();
            System.out.println("Enter the side:");
            int side=sc.nextInt();
            sq.getSide(side);        
            System.out.println("Enter P for perimeter and A for area:");
            char ch=sc.next().charAt(0);

            if(ch=='P'){
                System.out.println("Perimeter of square is: "+ sq.perimeter(side));
            }
            else if(ch=='A'){
                System.out.println("Area of square is: "+ sq.area(side));
            }
                break;


            case "Rectangle":
            Rectangle rect=new Rectangle();
            rect.name="Rectangle";
            rect.printName();
            System.out.println("Enter the length and breadth:");
            int length=sc.nextInt();
            int breadth=sc.nextInt();
            rect.getDimensions(length, breadth);        
            System.out.println("Enter P for perimeter and A for area:");
            ch=sc.next().charAt(0);

            if(ch=='P'){
                System.out.println("Perimeter of rectangle is: "+ rect.perimeter(length, breadth));
            }
            else if(ch=='A'){
                System.out.println("Area of rectangle is: "+ rect.area(length, breadth));
            }
            break;


            case "Circle":
                Circle cir=new Circle();
                cir.name="Circle";
                cir.printName();
                System.out.println("Enter the radius:");
                int radius=sc.nextInt();
                cir.getRadius(radius);        
                System.out.println("Enter P for perimeter and A for area:");
                ch=sc.next().charAt(0);

                if(ch=='P'){
                    System.out.println("Perimeter of circle is: "+ cir.perimeter(radius));
                }
                else if(ch=='A'){
                    System.out.println("Area of circle is: "+ cir.area(radius));
                }
            break;

            default:
                System.out.println("Invalid shape name");
                break;
        }
        
    }    
}
