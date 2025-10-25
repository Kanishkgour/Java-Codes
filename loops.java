public class loops {

    public static void main(String[] args) {
        // //For Loop
        // for(int i =1 ; i <= 10 ; i++ ) {
        // System.out.println(i);
        // }

        // // While Loop
        // int i = 3;
        // while (i<5) {
        // System.out.println(i);
        // i++;
        // }

        int[] number = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(number);
        for (int num : number) {
            System.out.println("Num: " + num);
        }
    }
}