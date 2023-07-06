import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class task_2DZ2 

{
    public static void main(String[] args) {
        String logFilePath = "calc_log.txt";
        Scanner scanner = new Scanner (System.in); 
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        
FileWriter logFileWriter = new FileWriter(logFilePath);

            logFileWriter.write("Исходные данные: ");
            println(num1, num2,logFileWriter);

switch (operator) 
           { case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: некорректная операция!");
                return;

                 logFileWriter.write("Результат " );
                        println(result, logFileWriter);
        }
logFileWriter.close();
        System.out.println("Результат: " + result);
    }
}

