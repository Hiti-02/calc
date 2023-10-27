import java.util.*;

public class j02calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Invalid Modulus");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
