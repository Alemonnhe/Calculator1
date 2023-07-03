import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) throws Exception {
            String[] oper = {"+", "-", "/", "*"};
            String[] rOper = {"\\+", "-", "/", "\\*"};
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите пример: ");
            String exp = scanner.nextLine();
            int actionIndex = -1;
            for (int i = 0; i < oper.length; i++) {
                if (exp.contains(oper[i])) {
                    actionIndex = i;
                    break;
                }
            }
            if (actionIndex == -1) {
                System.out.println("Введите пример");
                return;
            }
            String[] data = exp.split(rOper[actionIndex]);
            if (data.length > 2) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            int a;
            int b;
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
            if (a < 1 | a > 10 | b < 1 | b > 10) {
                throw new Exception("Допустимы числа от 1 до 10.");
            }
            int result = 0;
            switch (oper[actionIndex]) {

                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }
            System.out.println("Результат: " + result);
    }

    }

