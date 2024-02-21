package operazionimat;

import java.util.Scanner;

public class OperazioniMat {

    public static void main(String[] args) {
        int a = 0, b = 0;
        boolean avanti = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il primo numero: ");
        if (scan.hasNextInt()) {
            a = scan.nextInt();
        } else {
            avanti = false;
        }
        scan.reset();
        System.out.println("inserisci il secondo numero: ");

        if (avanti && scan.hasNextInt()) {
            b = scan.nextInt();
        } else {
            avanti = false;
        }
        if (avanti) {
            Operazioni o = new Operazioni(a, b);
            System.out.println(o.stampa());
        } else {
            System.out.println("non hai inserito un numero valido, riprova");
        }
        scan.close();
    }

}
