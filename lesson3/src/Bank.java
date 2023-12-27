import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальную сумму вклада: ");
        float vklad = scanner.nextFloat();
        System.out.println("Введите количество месяцев: ");
        int months = scanner.nextInt();
        System.out.println("Конечная сумма вклада: ");
        for (int i = 0; i<months;i++)
            vklad *= 1.07;
        System.out.print(vklad);
    }
}
