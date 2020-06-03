package bhyte.bank.herdado;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
		super.agencia = agencia;
		numero = conta;
	}
	
	@Override
	public void deposita(double valorDeposito) {
		super.saldo+=valorDeposito;
	}

	public void setTitular(Cliente cliente) {
		super.titular = cliente;
	}

}
