class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();

        Bird peacock = new Bird();
        peacock.color = "red";
        System.out.println(peacock.color);

        Mammel human = new Mammel();
        human.breathe();
   }
}
//parent class
class Animal{
    String color;
    
    void eat(){
        System.out.println("eat");
    }

    void breathe(){
        System.out.println("breathe");
    }
}
//child 1 
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}
//child 2
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
//child 3
class Mammel extends Animal{
    void run(){
    system.out.println("can run");
    } 
}