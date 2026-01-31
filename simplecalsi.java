
import java.util.Scanner;

public class simplecalsi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter numb 2");
        int b = sc.nextInt();
        System.out.println("enter the desired operation");
        char c = sc.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("enter valid operator");
        }

    }
}
