package TreinamentoDia1;

import java.util.Scanner;

public class ExercIfElse3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.next();

        System.out.println("Sexo: ");
        String sexo = sc.next();

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        char sexoApenasAPrimeiraLetra = sexo.toCharArray()[0];

        double pesoIdeal = 0;
        if (sexoApenasAPrimeiraLetra == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
                    }
        System.out.println(pesoIdeal);

    }
}