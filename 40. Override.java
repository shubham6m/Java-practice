class overriding{
    public static void main(String[] args) {
        Deer mareech = new Deer();
        mareech.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer{
    void eat(){
        System.out.println("eats grass");
    }
}

/* class overloading{
    public static void main(String args[]){
    Calculator cal = new Calculator();
    System.out.println(cal.sum(2, 0));
    System.out.println(cal.sum(2.4f, 5.4f));
    System.out.println(cal.sum(2, 8,10));
    }
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
} */