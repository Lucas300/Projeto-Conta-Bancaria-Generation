package conta.model;

public class ContaCorrente extends Conta {
	// Atributos
	private float limite = 0;

	// METODOS construtores
	public ContaCorrente(int numero, int agencia, int tipo, String titula, float saldo, float limite) {
		super(numero, agencia, tipo, titula, saldo);
		this.limite = limite;
	}

	// polimorfismo
	public ContaCorrente(int numero, int agencia, int tipo, String titula, float saldo) {
		super(numero, agencia, tipo, titula, saldo);
		this.limite = limite = 5000;
	}

	// metodos de acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	// polimorfismo de sobrescrita
	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		super.visualizar();
		System.out.println("Limite: " + this.limite);
	}

}
