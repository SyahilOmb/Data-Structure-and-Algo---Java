
import java.util.Scanner;

public class prime {


  public void primechecker(int n){
   for(int i=2; i<= Math.sqrt(n) ; i++){
     if(n % i ==0){
        System.out.println("this is prime number" + n);
        return;
     }
   }

  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
      prime pri = new prime();
      pri.primechecker(n);

    }
}
