import java.io.FileWriter;
import java.io.IOException;

public class task_1DZ2 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 3};
        String logFilePath = "sorting_log.txt";

        try {
            FileWriter logFileWriter = new FileWriter(logFilePath);

            logFileWriter.write("Исходный массив: ");
            printArray(array, logFileWriter);

            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        logFileWriter.write("Итерация " + (i + 1) + ": ");
                        printArray(array, logFileWriter);
                    }
                }
            }

            logFileWriter.close();
            System.out.println("Сортировка пузырьком завершена. Результат записан в лог-файл " + logFilePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в лог-файл: " + e.getMessage());
        }
    }

    public static void printArray(int[] array, FileWriter writer) throws IOException {
        for (int i = 0; i < array.length; i++) {
            writer.write(array[i] + " ");
        }
        writer.write("\n");
    }
}