public class Shallow_DeepCopy {
   public static void main(String args[]){
    Student s1 = new Student();
    s1.roll = 345;
    s1.password = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;
  }
    
}
 // shallow copy constructor
 class Student{
    String name;
    int roll;
    String password;
    int marks[];
// Student(Student s1){
//     marks = new int[3];
//     this.name = s1.name;
//     this .roll = s1.roll;
//     this.marks = s1.marks;
// }

// Deep copy constructor
Student(Student s1){
    marks = new int[3];
        this.name = s1.name;
        this .roll = s1.roll;
        for(int i=0;i<= marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
}
   

 }
