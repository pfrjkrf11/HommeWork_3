import java.util.Random;

public class task_11_70 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] possibleResults = {0, 1, 3};

        System.out.print("Резултаты команды: ");
        int[] teamResults = new int[20];
        for (int i = 0; i < teamResults.length; i++) {
            teamResults[i] = possibleResults[rand.nextInt(possibleResults.length)];
            System.out.print(teamResults[i] + " ");
        }

        System.out.println();

        int wins = 0;
        int draws = 0;
        int sumOfPoints = 0;

        for (int x : teamResults) {
            if (x == 1) {
                draws += 1;
                sumOfPoints = sumOfPoints + 1;
            } else if (x == 3) {
                wins += 1;
                sumOfPoints = sumOfPoints + 3;
            }
        }
        System.out.println(String.format("Количество побед: %d", wins));
        System.out.println(String.format("Количество ничейных результатов: %d", draws));
        System.out.println(String.format("Общее количество очков: %d", sumOfPoints));


    }
}


