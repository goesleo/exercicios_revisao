import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class exercicio_cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList nomes = new ArrayList();

        System.out.println("Quantos nomes serão digitados?");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome " + (i + 1)+ ":");
            String nome = sc.nextLine();
            nomes.add(nome);
        }
        //Collections vai colocar os nomes em ordem alfabetica
        Collections.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }


    }
}