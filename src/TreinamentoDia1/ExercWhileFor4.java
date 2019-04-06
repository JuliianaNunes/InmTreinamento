package TreinamentoDia1;

import java.util.Scanner;

public class ExercWhileFor4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = 1;
        int numero = 0;
        int soma = 0;

        while (x <=10) {
            numero = sc.nextInt();
            if (numero <=40) {
                soma = soma + numero;
            }
       x++;
        }

        System.out.println("Sua soma é: " +soma);





                }
}
