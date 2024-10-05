import java.util.Scanner;

public class task_11_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;

        System.out.println("Диапазон массива от 1 до 12");

        do {
            System.out.print("Введите индекс элемента массива:");
            index = scanner.nextInt();

            if (index < 1 || index > 12) {

                System.out.println("Ошибка. Введите число от 1 до 12");

            }
        } while (index < 1 || index > 12);


        int[] massive = new int[12];

        for (int i = 0; i < massive.length; i++) {

            massive[i] = (int) ((Math.random() * (190 - 163 + 1) + 163));
            System.out.println(String.format("Рост чела № %d равен %d", (i + 1), massive[i]));

        }
        System.out.println();
        System.out.println(String.format("Значение массива с индексом %d равно %d", index, massive[index - 1]));

    }
}
