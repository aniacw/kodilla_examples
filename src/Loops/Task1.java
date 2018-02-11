package Loops;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = 0;

        System.out.println("Give the number");
        int number = in.nextInt();
        int [] numbers = new int[100];
        numbers[index] = number;


        while (number!=150) {
            index++;
            System.out.println("Give the number");
            number = in.nextInt();
            if (number != 150) {
                numbers[index] = number;
            }
        }

        int sum =0;
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] != 0) {
                System.out.print(numbers[i] + " ,");
                sum+=numbers[i];
            }
        }
        System.out.println("sum "+sum);

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 0 && numbers[i] %3 == 0) {
                int num = numbers[i];
                System.out.println("numbers divided by 3: " + num);
            }
        }

    }

}