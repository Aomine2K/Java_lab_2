public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */


       /*

        iteorowanie w dół
        int i = 10;
        System.out.println("Wartość i to: " + i);

        do {
        System.out.println(i--);

        } while (i >= 0);
        */
/*
        int i = 59392;
        System.out.println("Wartość i to: " + i);

        do {
            System.out.println(i--);

        } while (i % 92 == 0);
*/

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while

          /* int[] tablica = new int[5];
        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 3;
        tablica[3] = 4;
        tablica[4] = 5;

        int i = 5;
        while (i-- >= 0) {

         System.out.println(tablica[i]);
  }
  */
        /*
        b) jak wyżej tylko dla tablicy typu double[],

double[] tablica = new double[5];
        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 3;
        tablica[3] = 4;
        tablica[4] = 5;

        int i = 5;
        while (i-- >= 0) {

         System.out.println(tablica[i]);
  }
        */



        /*

        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu

        String[] tablica = new String[5];
        tablica[0] = "1";
        tablica[1] = "2";
        tablica[2] = "3";
        tablica[3] = "4";
        tablica[4] = "5";

        int i = 5;
        while (i-- >= 0) {

            System.out.println(tablica[i]);
        }
*/




        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)

        int i = 2;

        while (true){
       System.out.println(i);
        }
*/

        /*
        b) a jak gdy damy false --> while(false)

        int i = 2;

        while (true){
       System.out.println(i);
        }
        */


    }
}
