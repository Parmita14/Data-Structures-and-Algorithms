public class Encapsulation {
    // Encapsulation is defined as the wrapping up of data & methods under a single unit.It also implements data hiding.
    // data hiding is possible using access modifier.
    // Constructor is a special method which is invoked automatically at the time of object creation.
    // Constructor have the same name as class or structure
    // constructors dont have a return type.(Not even void)
    //Constructor are only called once, at object creation.
    // memory allocation happens when constructor is called.

    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("parmita");
        Student s3 = new Student(123);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        
       // System.out.println(s1.name);
    }
}

// constructor overloading ->  when java automatically decides which constructor to call based on parameeters.
// Copy constructor -> to copy all properties of an object to another object. 

class Student{
    String name;
    int roll;
    String password;
    int marks[];
     
    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student(String name){
        marks = new int[3];
       this.name = name;
    }
    Student(){
        marks = new int[3];
        System.out.println("constructor is called..");
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }

}
