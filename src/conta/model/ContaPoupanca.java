package conta.model;

public class ContaPoupanca extends Conta {
	// Atributos
	private int aniversario;

	// METODOS construtores
	public ContaPoupanca(int numero, int agencia, int tipo, String titula, float saldo, int aniversario) {
		super(numero, agencia, tipo, titula, saldo);
		this.aniversario = aniversario;
	}

	// polimorfismo
	public ContaPoupanca(int numero, int agencia, int tipo, String titula, float saldo) {
		super(numero, agencia, tipo, titula, saldo);
		this.aniversario = aniversario;
	}

	// metodos de acesso
	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	// polimorfismo de sobrescrita
	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		super.visualizar();
		System.out.println("Aniversario: " + this.aniversario);
	}
}