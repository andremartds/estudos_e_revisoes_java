package arrays_e_collections.conta_array_primitivo;

public class ControllerConta {

	private int posicao;
	private Object[] contas;

	public ControllerConta() {
		this.contas = new Conta[10];
	}

	public void addConta(Conta conta) {
		this.contas[posicao] = conta;
		this.posicao++;
	}
	
	public Conta getReferencia(int pos) {
		return (Conta) this.contas[pos];
	}

	public int getSizeQuantidadeConta() {
		return this.posicao;
	}

	public boolean remove(int pos) {
		this.contas[pos] = null;
		if (this.contas[pos] == null) {
			this.posicao--;
			return true;
		}
		return false;
	}

}
