
public class quest {

    public static String checkPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter += 1;
                // System.out.println(num + " , " + i);
            }
        }
        if (counter == 2 || num == 1 || num == 2 || num == 0) {
            return ("prime Number");
        } else {
            return ("Not a Prime");
        }
    }

    public static void primeCounter(int num) {

        for (int i = 0; i <= num; i++) {
            if (checkPrime(i) == "prime Number") {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        int num = 100;
        primeCounter(num);

        // //ques1
        // int a = -10, b = -2;
        // String check = (a < 0) ? "negative" : "positive";
        // System.out.println(check);

        // // ques2
        // System.out.print("Enter temp: ");
        // double temp = sc.nextDouble();
        // if (temp >= 100) {
        // System.out.println("You have fever");
        // } else {
        // System.out.println("You have not fever");
        // }

        // // ques3
        // System.out.print("Enter Day Number: ");
        // int day = sc.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // break;
        // case 5:
        // System.out.println("Thursday");
        // break;
        // case 6:
        // System.out.println("Friday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Not in List");
        // break;
        // }

        // // quest 4
        // System.out.println("Enter year days : ");
        // int year = sc.nextInt();
        // if ((year % 4 == 0) || (year % 100 == 0) || (year % 400 == 0)) {
        // System.out.println("Leap Year");
        // }else{
        // System.out.println("Not a Leap Year");
        // }

        // // ques5 dispay all number except multipe of 10;
        // System.out.print("Enter a number: ");
        // int input = sc.nextInt();
        // while (true) {
        // if (input % 10 == 0) {
        // System.out.print("Enter Next: ");
        // input = sc.nextInt();
        // continue;
        // }
        // System.out.println("Your no: " + input);
        // System.out.print("Enter Next: ");
        // input = sc.nextInt();
        // sc.close();
        // }

        // // question 6

    }
}
