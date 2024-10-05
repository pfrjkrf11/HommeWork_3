public class task_11_43 {
    public static void main(String[] args) {

        int[] January = new int[30];

        System.out.print("Осадки выпавшие за январь, по дням: ");
        for (int i = 0; i < January.length; i++) {
            January[i] = (int) ((Math.random() * (15 + 1) + 0));
            System.out.print(January[i] + " ");
        }
        System.out.println();
        System.out.print("Дни без осадков: ");
        for (int i = 0; i < January.length; i++) {
            if (January[i] == 0) {
                System.out.print((i + 1) + " ");
            }
        }


    }
}
