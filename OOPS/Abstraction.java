public class Abstraction {
    // -> Cannot create an instance of abstract class
    // -> Can have abstract & non abstract methods
    // -> Can have constructor
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal{
    Animal(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
 abstract void walk();   
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    void walk(){
        System.out.println("Walks on 4 Legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
