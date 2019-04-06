package TreinamentoDia2;

public class Gerente extends Funcionario implements Autenticavel{
    public Gerente(String nome, String rg, String cpf, String cargo, String dataDeNascimento) {
        super(nome, rg, cpf, cargo, dataDeNascimento);
    }

    @Override
    public void recebeAumento() {
        this.salario *= 0.2;
    }

    @Override
    public boolean autentica(String user, String senha) {
        return false;
    }

}