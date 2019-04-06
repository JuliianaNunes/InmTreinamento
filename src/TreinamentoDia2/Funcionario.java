package TreinamentoDia2;

public abstract class Funcionario {

    protected String nome = null;
    protected String rg = null;
    protected String cpf = null;
    protected String cargo = null;
    protected double salario = 0;
    protected String matricula = null;
    protected String dataDeNascimento = null;

    public Funcionario(String nome, String rg, String cpf, String cargo, String dataDeNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dataDeNascimento = dataDeNascimento;
    }

    public abstract void recebeAumento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Funcionario: " + getNome();
    }
}
