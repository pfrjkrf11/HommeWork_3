import java.util.Scanner;

public class task_11_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] massive = {10, 20, 30, 40, 50};

        System.out.print("Исходный массив: ");

        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        System.out.println();

        System.out.print("Массив, в котором каждый элемент увеличен в два раза: ");

        for (int i = 0; i < massive.length; i++) {
            massive[i] = massive[i] * 2;
            System.out.print(massive[i] + " ");
        }
        System.out.println();

        System.out.print("Введите число А: ");
        int A = scanner.nextInt();

        int[] massive1 = {10, 20, 30, 40, 50};

        System.out.print(String.format("Массив, в котором каждый элемент уменьшен на число А=%d: ", A));

        for (int i = 0; i < massive1.length; i++) {
            massive1[i] = massive1[i] - A;
            System.out.print(massive1[i] + " ");
        }

        System.out.println();

        int[] massive2 = {10, 20, 30, 40, 50};
        int k = massive2[0];

        System.out.print(String.format("Массив, в котором каждый элемент разделен на первый элемент, который равен %d: ", massive2[0]));

        for (int i = 0; i < massive2.length; i++) {
            massive2[i] = massive2[i] / k;
            System.out.print(massive2[i] + " ");
        }


    }
}
