package Homeworks;

import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        System.out.println("Let the game begin!");

        Scanner in = new Scanner(System.in);

        //Name input
        System.out.print("Name : ");
        String name = in.next();

        //Random number generator
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;

        //Array that contains all entered numbers
        int[] arr = new int[100];

        //Number input
        System.out.print("Enter number : ");
        for (int i = 0; i < arr.length; i++) {
            while (!in.hasNextInt())
            {
                System.out.println("Invalid input\nType the int-type number:");
                in.next();
            }
            int number1 = in.nextInt();
            for (;;) {
                arr[i]=number1;
                break;
            }
            if(number1 > randomInt){
                System.out.println("Your number is too big. Please, try again.");
                continue;
            }
            else if (number1 < randomInt) {
                System.out.println("Your number is too small. Please, try again.");
                continue;
            }
            else{
                System.out.println("Congratulations " + name + "!");
                break;
            }
        }

        //Array output
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0) System.out.print(arr[i] + " ");
        }

        //Advanced Complexity - Last task
        System.out.println();
        System.out.println("Next steps. Let's begin!");

        Random rand = new Random();
        String[][] events = {{"1914","World War 1"},{"1939","World War 2"},{"1945","Victory Day"},{"1918","Republic Day"},{"2020","Victory Day of Azerbaijan"}};
        int rnd1 = rand.nextInt(events.length);
        int rnd2 = rand.nextInt(events[rnd1].length);
        System.out.println(events[rnd1][1]);

        System.out.println("When happened " + events[rnd1][1] + "?");
        Scanner scanner = new Scanner(System.in);

        while(true){
            int year = scanner.nextInt();
            if (year==Integer.parseInt(events[rnd1][0])) {
                System.out.println("Congratulations. You won!");
                break;
            }
            else {
                System.out.println("This isn't correct. Please try again : ");
                continue;
            }
        }
    }
}
