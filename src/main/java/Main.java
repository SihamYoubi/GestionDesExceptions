import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        try {
            while (nombre > -1) {
                System.out.println("Entrer une valeur: ");
                nombre = scanner.nextInt();
                EntierNaturel entierNaturel = new EntierNaturel(nombre);
                System.out.println("la valeur avant décrementation: " + entierNaturel.getVal());
                entierNaturel.decrementer();
                System.out.println("modification de la valeur: ");
                nombre = scanner.nextInt();
                entierNaturel.setVal(nombre);
            }
        } catch (NombreNegatifException e) {
            System.out.println("La valeur est invalide: " + e.getValeurErronnee());
        }

    }


}
