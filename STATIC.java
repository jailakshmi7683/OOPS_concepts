class Mobile{

    String company;
    int price;
    static String type;

    void printDetails(){
        System.out.println("Company :"+company+"| Price : "+ price+"| Type: "+type);
    }

    static void printStatic(Mobile obj){
        System.out.println("Company :"+obj.company+"| Price : "+ obj.price+"| Type: "+type);
    }
}

public class STATIC {    
    public static void main(String[] args) {
        Mobile mobile1= new Mobile();
        mobile1.company = "Apple";
        mobile1.price = 60000;
        Mobile.type= "Smart Phone";
        mobile1.printDetails();
        Mobile.printStatic(mobile1);
    }
}