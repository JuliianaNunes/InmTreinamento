package TreinamentoDia2;

public class Diretor extends Funcionario implements Autenticavel {

    public Diretor(String nome, String rg, String cpf, String cargo, String dataDeNascimento) {
        super(nome, rg, cpf, cargo, dataDeNascimento);
    }

    @Override
    public void recebeAumento() {
        this.salario *= 1.3;
    }

    @Override
    public boolean autentica(String user, String senha) {
        return false;
    }
}
