package TreinamentoDia2;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario natalia = new Gerente("Natalia", "1234", "5678", "Gerente", "01/02/1992");
        Funcionario thiago = new Gerente("Thiago", "1234", "5678", "Diretor", "01/02/1992");

        ControldeDeBonificacoes controleDeBonificacoes = new ControldeDeBonificacoes();
        controleDeBonificacoes.registra(natalia);
        controleDeBonificacoes.registra(thiago);

        for (Funcionario funcionario : controleDeBonificacoes.getFuncionarios())
        System.out.println(funcionario);
    }
}

