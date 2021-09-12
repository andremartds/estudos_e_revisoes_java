package oo.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CDatas {
	private String sDia;
	private String sMes;
	private String sAno;
	private String sAcumulaData;
	private String dataSistema;
	
	public String getDataSistema(){
		return dataSistema;
	}

	public String getAcumulaData() {
		return sAcumulaData;
	}

	public String getDia() {
		return sDia;
	}

	public String setDia() {
		return sDia;
	}

	public String getMes() {
		return sMes;
	}

	public String setMes() {
		return sMes;
	}

	public String getAno() {
		return sAno;
	}

	public String setAno() {
		return sAno;
	}

	CDatas() {
		Date hoje = new Date();
		String formato = "dd/MM/yyyy";
		SimpleDateFormat dat = new SimpleDateFormat(formato);
		dataSistema = dat.format(hoje);
	}

	CDatas(String pDia,String pMes,String pAno) {
		this.sDia = pDia;
		this.sMes = pMes;
		this.sAno = pAno;
	}

	public String toString() {
		return this.sAcumulaData=sDia +"/"+ sMes+"/"+sAno;
	}

}