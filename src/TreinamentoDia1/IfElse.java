package TreinamentoDia1;

public class IfElse {
        public static void main(String[] args) {

            int idade = 10;

            if (idade >= 18 && idade < 60) {
                System.out.println("Você pode beber.");
            } else if (idade >= 60) {
                System.out.println("Você pode beber, mas na sua idade é morte certa!");
            } else {
                System.out.println("Você não pode beber!");
            }
        }
    }
