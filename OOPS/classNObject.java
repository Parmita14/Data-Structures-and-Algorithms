public class classNObject {
    public static void main(String args[]){
        Pen p1 = new Pen(); // created a pen object
        p1.setcolor("blue");
         p1.SetTip(4);
         System.out.println(p1.tip);
    }
} 

class Pen{
    String color;
    int tip;

    void setcolor(String newColor){
        color = newColor;
    }
    void SetTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }
}
// Access Modifiers
class BankAccount{
   public String username; // visible outside this class
   private String password; // using private -> no access outside this class

   public void setPassword(String pwd){ // with this method can change password from main
    password = pwd;
   }

}