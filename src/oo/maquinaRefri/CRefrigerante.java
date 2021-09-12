package oo.maquinaRefri;

public class CRefrigerante {
	private int iQuantidadeDeRefri;
	int iTotalDelatas = 50;
	private int iSeuDinheiro;
	private int iValorTroco;
	private int iValorRefri;
	private boolean bValorSuficiente;
	private int iValorUnitario;
	private String sSmg;

	int[] iRefri = null;
	final int iPepsi   =  0;
	final int iCoca    = 1;
	final int iFanta   = 2;
	final int iGuarana = 3;
	final int iSprite  = 4;
	
	public CRefrigerante()
	{
		iRefri = new int[5];
		iRefri[iPepsi] = 0;
		iRefri[iCoca] = 0;
		iRefri[iFanta] = 0;
		iRefri[iGuarana] = 0;
		iRefri[iSprite] = 0;
	}

	void abasteceRefri() {
		for (int i = 0; i < iRefri.length; i++) {
			if(iRefri[i] < 35){
				iRefri[i]=iTotalDelatas;
			}else
				iRefri[i]= iRefri[i];
	}
	}

	public int getValorRefri() {
		return iValorRefri;
	}

	public int setValorRefri(int pValor) {
		if (pValor < 0) {
			pValor = 0;
		} else
			iValorRefri = pValor;
		iValorUnitario = pValor;
		if (iValorRefri > iSeuDinheiro) {
			return this.iValorRefri = iQuantidadeDeRefri * iValorRefri;
		} else if (iValorRefri < iSeuDinheiro) {
			return this.iValorRefri = iQuantidadeDeRefri * iValorRefri;
		} else {
			return iSeuDinheiro = 0;
		}
	}

	public int getQuantidadeRefri() {
		return this.iQuantidadeDeRefri;
	}

	public void setQuantidadeRefriEMarca(int pQuantidadeDeRefri,int pCodigoMarcaRefri) {
		if(pQuantidadeDeRefri >=1 && pCodigoMarcaRefri >= 1 && pCodigoMarcaRefri <= 4 ){
			if (iQuantidadeDeRefri < 0) {
				iQuantidadeDeRefri = 0;
			} else if (iQuantidadeDeRefri >= 0)
				this.iQuantidadeDeRefri = pQuantidadeDeRefri;
			for(int i = 0;i < iQuantidadeDeRefri;i++){
			if (pCodigoMarcaRefri == 0) {
				this.sSmg = "Pépsi";
				iRefri[0] = iRefri[0] - 1;
			} else if (pCodigoMarcaRefri == 1) {
				this.sSmg = "Coca Cola";
				iRefri[1] = iRefri[1] - 1;
			} else if (pCodigoMarcaRefri == 2) {
				this.sSmg = "Fanta";
				iRefri[2] = iRefri[2] - 1;
			} else if (pCodigoMarcaRefri == 3) {
				this.sSmg = "Guaraná ";
				iRefri[3] = iRefri[3] - 1;
			} else if (pCodigoMarcaRefri == 4) {
				this.sSmg = "Sprite ";
				iRefri[4] = iRefri[4] - 1;
			}
		}
		}else
			sSmg = "( Você não pode colocar um valor negativo )";
	}

	void minhagrana(int pgrana) {
		iSeuDinheiro = pgrana;
	}

	int iTroco() {
		if (iValorRefri > iSeuDinheiro) {
			return iValorTroco = 0;
		} else
			return iValorTroco = iSeuDinheiro - iValorRefri;
	}

	boolean ValorSuficiente() {
		if (iValorRefri > iSeuDinheiro) {
			return this.bValorSuficiente = false;
		} else
			return this.bValorSuficiente = true;
	}

	void vImprimeResultado() {
		System.out.println(" a quantidade de Refrigerante que você pediu é  = "
				+ iQuantidadeDeRefri + sSmg + "\n o Valor unitário é ="
				+ iValorUnitario + "\n o valor total é = " + iValorRefri
				+ "\n a marca do refrigerante que voce escolheu é  = " + sSmg
				+ "\n Voce depositou ná máquina = " + iSeuDinheiro
				+ "\n Valor Suficiente: " + bValorSuficiente
				+ "\n o seu Troco é = " + iValorTroco
				+ "\n Quantidade de Pepsi em estoque = " + iRefri[0]
				+ "\n Quantidade de CocaCola em estoque = " + iRefri[1]
				+ "\n Quantidade de Fanta em estoque = " + iRefri[2]
				+ "\n Quantidade de Guaraná em estoque = " + iRefri[3]
				+ "\n Quantidade de Sprite em estoque = " + iRefri[4]);

	}

	public void vNovaLinha() {
		System.out
				.println(" ********************************************************************** "
					+"\n +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ");
	}

}
