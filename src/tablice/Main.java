package tablice;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random random = new Random();
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = random.nextInt(24)+1;
            System.out.print(numbers[i]+" ,");
        }
        method(numbers);
    }

    public static void method(int[] numbers){
        for(int number : numbers){
            if(number > 10){
                System.out.println(number);
            }
        }
    }
}
