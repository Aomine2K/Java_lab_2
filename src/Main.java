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
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        int[] tablica = new int[5];
        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 3;
        tablica[3] = 4;
        tablica[4] = 5;

    System.out.println(tablica[0]);
    System.out.println(tablica[1]);
    System.out.println(tablica[2]);
    System.out.println(tablica[3]);
    System.out.println(tablica[4]);




        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


    }
}
