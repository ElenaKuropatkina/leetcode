import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int i = 0;
        try {
            i = scanner.nextInt();
        } catch (RuntimeException exception) {
            System.out.println("Введенное число выходит за рамки диапазона int");
        }
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverse(i);
        System.out.println(result);

    }
}
