import java.util.Scanner;

public class task_11_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива:");
        int quantityOfElements = scanner.nextInt();

        int[] massive = new int[quantityOfElements];

        for (int i = 0; i < massive.length; i++) {
            System.out.print("Введите элемент массива:");
            massive[i] = scanner.nextInt();
        }

        System.out.print("Ваш массив: ");

        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        System.out.println();
        System.out.print("Ваш массив в обратном порядке: ");

        for (int i = massive.length; i > 0; i--) {
            System.out.print(massive[i - 1] + " ");
        }
    }
}
