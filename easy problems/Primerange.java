// public class Primerange{
//   public static void primePrint(int low, int high){
//     if(low<1){
//       System.out.println("can't print prime series");
//     }
//     else{
//       for(int i = low; i<=high; i++){
//         boolean isPrime = true;
//         if(i < 2) {
//           isPrime = false;
//         } else {
//           for(int j = 2; j <= Math.sqrt(i); j++){
//             if(i % j == 0){
//               isPrime = false;
//               break;
//             }
//           }
//         }
//         if(isPrime){
//           System.out.println(i+" ");
//         }
//       }
//     }
//   }
//   public static void main(String args[]){
//     Primerange(5, 20);
//   }
// }


public class prime{
  public static void Primerange(int n){
    if(n<1){
      System.out.println("can't print");
    }
    else{
      for(int i = 0; i<n; i++){
        boolean isPrime = true;
        if(i<=2){
          isPrime = false;
        }else{
          for(int j = 2; j<Math.sqrt(i); j++){
            if(i%j == 0){
              isPrime = false;
              break;
            }
          }
          if(isPrime){
            System.out.println(i + " ");
          }
        }
        
      }
    }
  }
  public static void main(String[] args) {
    Primerange(10);
  }
}
