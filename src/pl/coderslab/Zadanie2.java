package pl.coderslab;

import java.util.*;

public class Zadanie2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int array[] = new int[6];
        int arraygracz[] = new int[6];

        for (int i = 0; i < 6; i++) {
            array[i] = rand.nextInt(50);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;

                }

            }

        }
        Scanner scanner = new Scanner(System.in);


        int liczba;

        for (int j = 0; j < array.length; j++) {
            boolean isCorrect = true;
            try {

                System.out.println("Zgadnij liczbę " + (j + 1));
                liczba = scanner.nextInt();

                for(int i=0; i< arraygracz.length; i++) {
                    if (liczba == arraygracz[i]) {
                        System.out.println("Liczba się powtarza");
                        isCorrect = false;
                        break;
                    }
                }
                if (liczba > 49 || liczba < 0) {
                     System.out.println("Błędna liczba");
                    isCorrect = false;
                }
                if (isCorrect){
                        arraygracz[j] = liczba;
                } else {
                    j--;
                }


            } catch (Exception e) {

                System.out.println("To nie jest liczba");
                j--;
                scanner.next();


            }

        }

        Arrays.sort(arraygracz);

        System.out.println("Twoje wytypowane liczby to:");

        for (int k = 0; k < arraygracz.length; k++) {
            System.out.print(arraygracz[k] + ", ");
        }

        System.out.println();
        System.out.println("Liczby wylosowane przez komputer to:");

        for (int w = 0; w < array.length; w++) {
            System.out.print(array[w] + ", ");
        }

        int trafionych = 0;
        for (int o = 0; o < array.length; o++) {
            for (int i = 0; i < array.length; i++) {
                if (array[o] == arraygracz[i]) {
                    trafionych++;
                }

            }

        }
        if (trafionych <= 3) {

            System.out.println("Trafiłeś " + trafionych);
        }


    }

}
