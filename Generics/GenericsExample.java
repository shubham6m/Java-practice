public class GenericsExample {
  public static void main(String args[]){
      // IntegerPrint obj = new IntegerPrint(23);
      // DoublePrint obj = new DoublePrint(22.21);

      // PrintVar<Integer> obj = new PrintVar<>(23);
      PrintVar<String> obj = new PrintVar<>("shubham");
      obj.print();
  }
}

// class IntegerPrint {
//   Integer var;

//   public IntegerPrint(Integer var){
//     this.var = var;
//   }

//   public void print(){
//     System.out.println("value is " + var);
//   }
// }
// //means for each data type we need same class -> so to resolve this issue generics come into picture
// class DoublePrint{
//   Double var;

//   public DoublePrint(Double var){
//     this.var = var;
//   }

//   public void print(){
//     System.out.println("value of var " + var);
//   }
// }

// this works for each varible type -> whether it is integer, double or string
class PrintVar<T>{
    T var;

    public PrintVar(T var){
      this.var = var;
    }

    public void print(){
      System.out.println(var);
    }
}