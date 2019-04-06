package TreinamentoDia2;

public class MetodoAtributo {

    private String nome = null;
    private int agencia = 0;
    private int conta = 0;
    private double saldo = 0;

    public MetodoAtributo(String nome, int agencia, int conta)
    {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
    }

    public void saca(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    public void deposita(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void transfere(double valor, MetodoAtributo outraconta) {
        this.saca(valor);
        outraconta.deposita(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Conta do " + getNome() + "tem saldo de R$" +getSaldo();
    }
}
