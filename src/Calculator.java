import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int numeral1 = number();
        int numeral2 = number();
        char count = operation();
        int result = calculator(numeral1, numeral2, count);
        System.out.println(result);
    }

    public static int number() {
        System.out.println("Введите число");
        int numeral;
        if (scan.hasNextInt()) {
            numeral = scan.nextInt();
        }else {
            System.out.println("Неверные данные, повторите ввод");
            scan.next();
            numeral = number();
        }
        return numeral;
    }
    public static char operation(){
        System.out.println("Укажите операцию");
        char count;
        if(scan.hasNext()){
            count = scan.next().charAt(0);
        }else {
            System.out.println("Неверные данные, повторите ввод");
            scan.next();
            count = operation();
        }
        return count;
    }
    public static int calculator(int numeral1, int numeral2, char count ){
        int result;
        switch (count) {
            case '+':
                result = numeral1 + numeral2;
                break;
            case '-':
                result = numeral1 - numeral2;
                break;
            case '*':
                result = numeral1 * numeral2;
                break;
            case '/':
                result = numeral1 / numeral2;
                break;
            default:
                System.out.println("Действие не задано");

                result = calculator(numeral1, numeral1, operation());
        }
        return result;
    }
}