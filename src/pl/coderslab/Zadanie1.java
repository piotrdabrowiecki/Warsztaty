package pl.coderslab;

import java.util.*;

public class Zadanie1 {

     public static void main(String[] args) {


          Random rand = new Random();
          int random = rand.nextInt(101);

          System.out.println("Zgadnij liczbę");


          Scanner scanner = new Scanner(System.in);


          int liczba;
          liczba = 255;

          while(liczba != random) {

               try {

                    liczba = scanner.nextInt();
                    if (liczba < random) {

                         System.out.println("za mało");

                    } else if (liczba > random) {

                         System.out.println("za dużo");


                    } else {
                         System.out.println("Zgadłeś!");
                         return;
                    }

               } catch (Exception e) {

                    System.out.println("To nie jest liczba");
                    scanner.next();



               }




          }















     }






}
