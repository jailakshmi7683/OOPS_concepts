public class Main1 {

    public static void main(String[] args) {
        animals a2 = new animals();
        a2.name = "Elephant";
        a2.food = "Fruits";
        a2.printName();
        a2.eat();

        animals a1 = new Carnivore();
        a1.name = "Lion";
        a1.food = "Meat";
        a1.printName();
        a1.eat();

        Carnivore c1 = new Carnivore();
        c1.name = "Tiger";
        c1.food = "Deer";
        c1.printName();
        c1.eat();

        Herbivore h2 = new Herbivore();
        h2.name = "Deer";
        h2.food = "Leaves";
        h2.printName();
        h2.eat();

        Herbivore h1 = new Cow();
        h1.name = "Cow";
        h1.food = "Grass";
        h1.printName();
        h1.eat();

        Cow cow1 = new Cow();
        cow1.name = "Buffalo";
        cow1.food = "Hay";
        cow1.printName();
        cow1.eat();

    }
    
}
