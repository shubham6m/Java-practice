public class BoundedGenerics{
    public static void main(String args[]){
        Generics<Animal> obj = new Generics<>(new Cat());
        Generics<Animal> obj2 = new Generics<>(new Dog());

        obj.print();
        obj2.print();
        //pass more than one generics at a time
        Gene<Integer, String> obj3 = new Gene<>(23, "shubham");
        obj3.print();
    }
    
}
//this means T type is bounded with animal type varible only we can use animal type & in similar way we can add more bound like 
// class Generics<T extend Animal & Vehicle>
class Generics<T extends Animal>{
    T var;

    public Generics(T var){
        this.var = var;
    }

    public void print(){
        System.out.println(var);
    }
}

class Animal{
    public void print(){
        System.out.println("Inside the animal class");
    }
}

class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat";
    }
}

class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog";
    }
}

//we can use more than one generics at a time
class Gene <T, V>{
    T var1;
    V var2;
    public Gene(T var1, V var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    public void print(){
        System.out.println("values are " + var1 +" & " + var2);
    }
}
