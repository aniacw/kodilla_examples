package tablice;

import java.util.Random;

public class Zad1 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5) + 5;
        System.out.println("Size: " + size);

        int[] newTable = new int[size];
        for (int i = 0; i < newTable.length; i++) {
            int element = random.nextInt(29) + 1;
            newTable[i] = element;
            if (newTable[i] % 2 == 0) {
                System.out.print(newTable[i]+", ");
            }

            // evenElements();
        }

       /* public static int evenElements(int[] newTable){
            int evenElement = 0;
            if(newTable % 2 == 0){
                evenElement = newTable;
            System.out.println("Even elements: "+newTable);
            }
        }*/
    }

}
//stworz metode, ktora bedzie wyswietala na ekranie tylko liczby pierwsze