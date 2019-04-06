package TreinamentoDia2;

public class ControldeDeBonificacoes {
    private Funcionario[] funcionarios = new Funcionario[2];

    private int cont = 0;

    public void registra(Funcionario funcionario) {
        this.funcionarios[cont] = funcionario;
        cont++;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
}
