import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальную сумму вклада: ");
        float vklad = scanner.nextFloat();
        System.out.println("Введите количество месяцев: ");
        int months = scanner.nextInt();
        System.out.println("Конечная сумма вклада: ");
        float summ = 0;
        for (int i = 0; i<months;i++)
        {
            summ = vklad + vklad*7/100;
            vklad=summ;
        }
        System.out.print(summ);
    }
}
