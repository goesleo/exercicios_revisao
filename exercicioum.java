import java.util.Scanner;
   //Crie um programa Java que receba dois números e exiba o maior
public class exercicioum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int num1 = scanner.nextInt();
    System.out.println("Digite outro numero: ");
    int num2 = scanner.nextInt();

    if(num1 > num2){

        System.out.println( num1 +  " é maior que  " + num2);

    }
    else if(num1 < num2){
        System.out.println(num2 + " é maior que  " + num1);

    }
    else{
        System.out.println("os dois numeros são iguais ");
    }










    }
}
