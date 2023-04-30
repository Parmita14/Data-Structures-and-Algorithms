public class Polymorphism {
    // Method Overloading ->Multiple functions with same name but different parameter.
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 3));
        System.out.println(calc.sum(2,3,4));
        System.out.println(calc.sum((float)5.0, (float)9.0  ));

        Deer d = new Deer();
        d.eat();
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
// Method Overriding -> Parent child classes both contain the same function with different definition.
 class Animal{
    void eat(){
        System.out.println("eats anything");
    }
 }
 class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
 }
