public class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();

    }
}
//parent class/ base class
class Animal{
    String color;
    
    void eat(){
        System.out.println("eat");
    }

    void breathe(){
        System.out.println("breathe");
    }
}
//child class/ derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}