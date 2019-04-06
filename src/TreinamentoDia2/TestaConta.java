package TreinamentoDia2;

public class TestaConta {

    public static void main(String[] args) {
        String[] bancos = listarTodosOsBancos();
        System.out.println(bancos);

        String numeroUm = String.valueOf(1);
        System.out.println(numeroUm);

        MetodoAtributo contaDaJuliana = new MetodoAtributo("Juliana", 12345,98765);
        MetodoAtributo contaDoLuiz = new MetodoAtributo("Luiz", 12345,98765);

        contaDaJuliana.setSaldo(10000);
        contaDoLuiz.setSaldo(10);

        System.out.println("Saldo da Juliana: " + contaDaJuliana.getSaldo());
        contaDaJuliana.saca(100);

        System.out.println("Saldo da Juliana: " + contaDaJuliana.getSaldo() );

        contaDaJuliana.transfere(50, contaDoLuiz);
        System.out.println("Saldo da Juliana: " + contaDaJuliana.getSaldo() );
        System.out.println("Saldo do Luiz: " + contaDoLuiz.getSaldo() );
    }

    static String[] listarTodosOsBancos() {
        String[] bancos = {"Bradesco", "BB", "Itau"};
        return bancos;
    }
}

