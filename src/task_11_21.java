public class task_11_21 {
    public static void main(String[] args) {

        int[] January = new int[30];

        System.out.print("Осадки выпавшие за январь, по дням: ");
        for (int i = 0; i < January.length; i++) {
            January[i] = (int) ((Math.random() * (15 + 1) + 0));
            System.out.print(January[i] + " ");
        }

        int sum = 0;
        for (int day : January) {
            sum = sum + day;
        }

        System.out.println();
        System.out.print(String.format("Количество осадков, выпашвишх в Январе равно %d мм", sum));


    }
}
