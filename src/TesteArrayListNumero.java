import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {
public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 10 números para continuar: ");
            for (int i = 0; i < 10; i++) {
                System.out.println("Número " + (i + 1) + " : ");
                int numero = scanner.nextInt();
                lista.add(numero);
            }
            if (lista.contains(10) || lista.contains(100) || lista.contains(1000)) {
                System.out.println("O seu número foi o ganhador que faz parte da lista: ");
            } else {
                System.out.println("Não foi dessa vez, tente novamente!");
            }
            scanner.close();
        }
}