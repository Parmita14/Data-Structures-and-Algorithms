public class Inheritance {
    // single level & mutli level
   public static void main(String args[]){
    // Fish shark = new Fish();
    // shark.eat();
    // shark.swim();
    dog bobby = new dog();
    bobby.legs = 4;

   } 
}
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
// derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims");
//     }
// }
class mammals extends Animal{
    int legs;

}
class dog extends mammals{
void walk(){
System.out.println("walks");
}
    String bark;
}
// Hierarchial Inheritance
class bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
