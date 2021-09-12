package oo.datas;

public class DatasTeste {

	public static void main(String[] args) {
		
		CDatas dataAtual = new CDatas("18","03","2013");
		System.out.println("A data informada pelo usuario é:"+dataAtual.toString());
		
		CDatas data1 = new CDatas();
		System.out.println("A data atual do seu sistema é: "+data1.getDataSistema());
		
		if(data1.getDataSistema().equals(dataAtual.toString())){
			System.out.println("A data informada é igual a data do Sistema Operacional ");
		}else
			System.out.println("A data informada não é igual a data do Sistema Operacional ");
			
		
}
}
