public class Getter_Setters {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("blue");
        p1.SetTip(4);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}
class Pen{
   private String color;
   private int tip;
    // this will replace the object for which it is called...so it has all the properties that object contains.
    // getter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    // setter
    void setcolor(String newColor){
        color = newColor;
        // this.color = newColor;
    }
    void SetTip(int newTip){
        tip = newTip;
    }
}
