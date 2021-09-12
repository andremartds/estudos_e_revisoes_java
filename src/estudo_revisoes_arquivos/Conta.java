package estudo_revisoes_arquivos;

/**
 * @author andremartds
 * Apenas uma classe comum do java, geralmente representa objetos relacionais
 * */
public class Conta {
	private String tipo;
	private Long agencia;
	private Long numero;
	private String nome;
	private Double saldo;
	
	public Conta(String tipo, Long agencia, Long numero, String nome, Double saldo) {
		this.tipo = tipo;
		this.agencia = agencia;
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	public void add(String tipo, Long agencia, Long numero, String nome, Double saldo) {
		this.tipo = tipo;
		this.agencia = agencia;
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	public Conta() {
		super();
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getAgencia() {
		return agencia;
	}
	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
}
