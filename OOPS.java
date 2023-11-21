public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();//create a pen object called p1\
        p1.setcolor("blue");
        // p1.color = "blue";
        System.out.println(p1.getcolor());
        p1.settip(4);
        System.out.println(p1.gettip());
    }

}
class Pen{
    //  String color;
    //  int tip;

    private String color;
    private int tip;

    String getcolor(){
    return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        color = newcolor;
    } 
    void settip(int newtip){
        tip = newtip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void caclpercentage(int phy, int chem, int maths){
//         percentage = (phy+chem+maths)/3;
//     }
// }