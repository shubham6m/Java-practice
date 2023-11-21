class Abstract{
    public static void main(String[] args) {
        Horse hira = new Horse();
        hira.walk();
//cannot create object for abstract class 
        // Animal deer = new Animal();
        // deer.eat();
        Chicken pup = new Chicken();
        pup.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animals eats");
    }
//this abstract methods are those which does not have any implementation 
// or in general we can say that only function is created not define anything inside it.
// subclass will define about **abstract function i.e. walk
//every subclass has own defination of abstract function
     abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println( "horse can walk");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("chicken can walk & fly a little too");
    }
}