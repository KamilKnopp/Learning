package Kamil.learning;

public class GalonToLitr {
    public static void main(String args[])
    {
        double galon, litr;
        int count;

        count = 0;
        for (galon = 1; galon <= 100; galon++)
        {
            litr = galon * 3.7854;
            System.out.println(galon +" galonů je " + litr +" litrů");

        count++;

        //kazdy 10. radek vypise prazdny radek
        if (count == 10)
            {
            System.out.println();
            count = 0; //vynuluj pocitadlo na 0
            }
        }
    }
}