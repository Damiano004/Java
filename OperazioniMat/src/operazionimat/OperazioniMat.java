package operazionimat;

import java.util.Scanner;

public class OperazioniMat {

    public static void main(String[] args) {
        int a, b;
        boolean avanti = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il primo numero: ");
        if (scan.hasNextInt()) 
        {
            a = scan.nextInt();
            System.out.println("inserisci il secondo numero: ");
            if (avanti && scan.hasNextInt()) 
            {
                b = scan.nextInt();
                Operazioni o = new Operazioni(a, b);
                System.out.println(o.stampa());
            }else
            {
                System.out.println("non hai inserito un numero valido, riprova");
            }
        } else 
        {
            System.out.println("non hai inserito un numero valido, riprova");
        }
        scan.close();
    }

}
