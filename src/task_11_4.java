public class task_11_4 {
    public static void main(String[] args) {
        int heights[] = new int[12];
        for (int i = 0; i < heights.length; i++) {

            heights[i] = (int) ((Math.random() * (190 - 163 + 1) + 163));

//            System.out.println("Рост чела №" + (i+1) + " равен: " + heights[i]);
            System.out.println(String.format("Рост чела № %d равен %d", (i + 1), heights[i]));

        }


    }
}
