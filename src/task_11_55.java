public class task_11_55 {
    public static void main(String[] args) {
        int[] massive = new int[5];
        System.out.print("Ваш массив: ");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) ((Math.random() * (100 + 1)));
            System.out.print(massive[i] + " ");
        }
        int sum = 0;

        for (int odd : massive) {
            if (odd % 2 != 0) {
                sum = sum + odd;
            }
        }
        System.out.println();
        System.out.print(String.format("Сумма нечтных элементов: %d", sum));

    }
}
