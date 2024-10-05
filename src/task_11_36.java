public class task_11_36 {
    public static void main(String[] args) {

        int[] massive = new int[20];
        System.out.print("Ваш массив: ");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) ((Math.random() * (500 + 500 + 1) - 500));
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        System.out.print("Все неотрицательные элементы: ");

        for (int element : massive) {
            if (element > 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        System.out.print("Все элементы, не превышающие 100: ");
        for (int element1 : massive) {

            if (element1 < 100) {
                System.out.print(element1 + " ");
            }
        }
    }
}
