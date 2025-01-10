/*
3. Să se insereze într-o anumită poziție a unui șir de caractere, un alt șir. Datele vor fi
preluate de la tastatură sau din fișier. Să se șteargă o porțiune a unui șir de caractere care
începe dintr-o anumită poziție și are un anumit număr de caractere. Se recomandă utilizarea
clasei StringBuilder.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class MainApp

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti sirul dorit: ");                          //citire sir initail
        StringBuilder text = new StringBuilder(scanner.nextLine());

        System.out.print("Introduceti sirul pe care il vreti inserat: ");                     //citire sir pt inserat
        String sirDeInserat = scanner.nextLine();

        System.out.print("Introduceti pozitia pe care sa se insereze sirul: ");             //citire poz pt inserare
        int pozitie = scanner.nextInt();
        scanner.nextLine();

        if (pozitie >= 0 && pozitie <= text.length())
        {
            text.insert(pozitie, sirDeInserat);
            System.out.println("Sir inserat: " + text);
        } else
        {
            System.out.println("Pozitia aleasa NU este posibila!! !");
        }

        System.out.print("Introduceti pozitia de pe care sa inceapa stergerea: ");     //pozitia pt stergere
        int pozitieStergere = scanner.nextInt();

        System.out.print("Introduceti nr de caractere ce vor fi sterse: ");                //cate caractere se sterg
        int numarCaractereStergere = scanner.nextInt();


        if (pozitieStergere >= 0 && pozitieStergere + numarCaractereStergere <= text.length())
        {
            text.delete(pozitieStergere, pozitieStergere + numarCaractereStergere);
            System.out.println("Noul sir:  " + text);
        } else
        {
            System.out.println("STERGEREA NU S-A PUTUT FACE!");


        }

        scanner.close();
    }
}