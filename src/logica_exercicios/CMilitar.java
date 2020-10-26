package logica_exercicios;

import javax.swing.*;
class CMilitar
{
	public static void main(String args[]) {
	int iSair = 1,iConvocados = 0, iNconvocados = 0, iIdade = 0;
	String sSexo = "";
	String sNome = "", sSaude ="";	
		while(iSair != 0 ) 
		{
		sNome=JOptionPane.showInputDialog(null,"Digite o Nome");
		sSexo=JOptionPane.showInputDialog(null,"Qual Sexo? Digite M para masculino ou F para feminio");
		if((sSexo.equals("m"))||(sSexo.equals("M")))
		{
		sSexo = "Masculino"; 
		}
		if((sSexo.equals("f"))||(sSexo.equals("F"))){	
		sSexo = "Feminino"; 
		}
		iIdade=Integer.parseInt(JOptionPane.showInputDialog(null,"Qual sua idade"));
		sSaude = JOptionPane.showInputDialog(null,"COMO ESTA SUA SAUDE? boa ou ruim \n digite apenas uma das duas opcoes");
		iSair++;		
		//sair = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 Zero para ver o resultado"));
		
		if((sSaude.equals("boa"))||(sSaude.equals("Boa")))
		{
			if((iIdade >= 18)&&(iIdade <= 30))
			{
			JOptionPane.showMessageDialog(null,"Obrigado seu sexo é " + sSexo+ "Seu nome " + sNome + "\n Sua sa�de e idade est�o atendendo nossas exigencias \n voce foi aprovado");
			iConvocados = iConvocados + 1; 			
			}
		   else if((sSaude.equals("ruim"))||(sSaude.equals("Ruim")))
		   {
			if((iIdade < 18)&&(iIdade>30))
			{
			 JOptionPane.showMessageDialog(null,"Obrigado seu sexo é " + sSexo+ "Seu nome " + sNome +"\n Sua saúde e idade nao estao atendendo nossas exigencias \n voce foi reprovado \n Obrigado");		
			 iNconvocados = iNconvocados + 1;
			 }
			}
			 else if((sSaude.equals("boa"))||(sSaude.equals("Boa")))
		   {
			if((iIdade < 18)&&(iIdade>30))
			{
			 JOptionPane.showMessageDialog(null,"Obrigado seu sexo é " + sSexo+ "Seu nome " + sNome +"\n Sua idade nao atendeu nossas exigencias \n voce foi reprovado \n Obrigado");		
			 iNconvocados = iNconvocados + 1;
			 }
			}
			else if((sSaude.equals("ruim"))||(sSaude.equals("Ruim")))
		   {
			if((iIdade >= 18)&&(iIdade <= 30))
			{
			 JOptionPane.showMessageDialog(null,"Obrigado seu sexo é " + sSexo+ "Seu nome " + sNome + "\n Sua sa�de nao atendeu nossas exigencias \n voce foi reprovado \n Obrigado");		
			 iNconvocados = iNconvocados + 1;
			 }
			}
		}
		iSair = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor 0 para sair ou 1 para novo candidato"));
		}
		JOptionPane.showConfirmDialog(null,"total de Convocados = " + iConvocados);
		JOptionPane.showConfirmDialog(null,"total de n�o Convocados = " + iNconvocados);
		
}
}