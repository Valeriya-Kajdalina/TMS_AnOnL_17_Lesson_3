public class Fibanachi {
    public static void main(String[] args) {
        System.out.println("Первые 11 членов последовательности Фибаначи: ");
        int number1 = 0;
        System.out.print(number1 + ", ");
        int number2 = 1;
        System.out.print(number2 + ", ");

        for (int i = 0; i < 9; i++) {
            int summ = number1+number2;
            System.out.print(summ + ", ");
            number1=number2;
            number2=summ;
        }
        System.out.print("...");

    }

}