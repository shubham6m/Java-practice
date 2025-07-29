class Multipleinheritance{
    public static void main(String[] args) {
          Bear b = new Bear();
          b.eatsflesh();
          b.eatsgrass();  
    }
}    
interface herbivore{
    void eatsgrass();
}

interface carnivore{
    void eatsflesh();
}
 class Bear implements carnivore, herbivore{
     public void eatsgrass(){
           System.out.println("bear eats grass");
    }
     public void eatsflesh(){
        System.out.println("bear eats flesh too");
     }
 }
