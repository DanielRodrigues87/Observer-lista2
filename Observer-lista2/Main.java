import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Estatistica e = new Estatistica();

        lista.adicionarObservador(e);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número para adicionar: ");
            int n = scanner.nextInt();
            lista.adicionarNumero(n);
        }
    }
}
