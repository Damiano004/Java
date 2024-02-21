package progettotris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y;
        String g1,g2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inserisci il tuo nome giocatore 1 (O): ");
        g1 = scan.nextLine();
        System.out.print("Inserisci il tuo nome giocatore 2 (X): ");
        g2 = scan.nextLine();
        Tris t = new Tris(g1, g2);
        System.out.println(t.toString());
        while (!t.isVinta()&&t.getTurno()<9) {
            System.out.println("\nè il tuo turno " + t.getGiocatore()
                    + ".\nInserisci le coordinate della tua mossa(x(1-3)y(1-3): ");
            do{
                do{
                    System.out.print("Inserisci la coordinata x: ");
                    x = scan.nextInt();
                }while(t.contCoor(x));
                do{
                    System.out.print("Inserisci la coordinata y: ");
                    y = scan.nextInt();
                }while(t.contCoor(y));
            }while(t.isOccupato(x, y));
            t.gioca(x, y);
            System.out.println(t.toString());
        }
        
        if (t.getTurno() == 9) {
            System.out.println("pareggio...");
        } else {
            System.out.println(t.messVittoria());
        }

    }
}
