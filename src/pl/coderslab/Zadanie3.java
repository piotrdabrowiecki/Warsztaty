package pl.coderslab;

import java.util.Scanner;
import java.util.*;

public class Zadanie3 {

    public static void main(String[] args) {


        System.out.println("Pomyśl liczbę od 1 do 1000, a ja ją zgadnę w 10 ruchach");
        System.out.println("                                ");

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        System.out.println("Podaj liczbe z zakresu 1-1000");
        if(liczba > 1000 || liczba < 1){

            System.out.println("Podales liczbe spoza zakresu");
        }

        int min = 0;
        int max = 1000;

        int guess = -1;



        while(guess != liczba) {

            guess =  (max - min)/2 + min;
            System.out.println("Zgaduję" + guess);



            if (guess < liczba) {

                System.out.println("za mało");
                min = guess;

            } else if (guess > liczba) {

                System.out.println("za dużo");
                max = guess;


            } else {
                System.out.println("Wygrałem!");

            }


        }





















    }




}
