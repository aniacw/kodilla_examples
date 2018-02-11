package Loops;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;

        System.out.println("Give the number");
        int number = scanner.nextInt();

        while(number>1){
            number = scanner.nextInt();
            if(maxNumber < number){
                maxNumber = number;
            }
        }

        Random random = new Random();

        for(int i =0; i< maxNumber; i++){
            System.out.println(random.nextInt(399)-199);
        }
    }
}
