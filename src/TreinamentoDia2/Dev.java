package TreinamentoDia2;

public class Dev extends Funcionario {
    public Dev(String nome, String rg, String cpf, String cargo, String dataDeNascimento) {
        super(nome, rg, cpf, cargo, dataDeNascimento);
    }

    @Override
    public void recebeAumento() {
        this.salario *= 0.3;
    }

}
