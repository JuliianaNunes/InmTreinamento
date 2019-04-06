package TreinamentoDia1;

public class ExercWhileFor5 {
    public static void main(String[] args) {

        double x = 15;
        double soma = 0;
        double media = 0;
        double a = 0;

        while (x <= 100) {
           soma += x;
           x++;
           a++;
        }
        media = soma /a;
        System.out.println("Sua média é: " + media);
    }
}
