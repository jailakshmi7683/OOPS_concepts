class animals {

    String name;
    String food;
    void printName(){
        System.out.println("This is "+ name);
    }

    void eat(){
        System.out.println(name + " eats " + food);
    }
}

class Carnivore extends animals{
    @Override
    void eat(){
        System.out.println(name + " eats only meat");
    }
}

class Herbivore extends animals{
    @Override
    void eat(){
        System.out.println(name + " eats only plants");
    }
}

class Cow extends Herbivore{

}

