import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


/*
        for (int i = 100; i > 0; i--) {

            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
*/

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */





        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę 1");
        int liczba1 = scan.nextInt();
        System.out.println("Podaj liczbę 2");
        int liczba2 = scan.nextInt();
        System.out.println("Podaj liczbę 3");
        int liczba3 = scan.nextInt();
        System.out.println("Podaj liczbę 4");
        int liczba4 = scan.nextInt();
        System.out.println("Podaj liczbę 5");
        int liczba5 = scan.nextInt();

        scan.close();

        int[] tablica = new int[5];

        tablica[0] = liczba1;
        tablica[1] = liczba2;
        tablica[2] = liczba3;
        tablica[3] = liczba4;
        tablica[4] = liczba5;



        for (int zmienna : tablica){
         System.out.print(zmienna * 11 + " ");
        }

    }
}
