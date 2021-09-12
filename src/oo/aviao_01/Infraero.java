package oo.aviao_01;

import java.util.ArrayList;

/* 
* criar um sistema da infraero para permitir a cria��o de aeroportos
* realizar a busca de um Voo por numero e nome da compahia e nome do aeroporto
*  
*  */
public class Infraero {

String nome;

Infraero(String nome){
    this.nome = nome;
}
Infraero(){}

ArrayList<Aeroporto> adAeroportos = null;

void adAeroporto(Aeroporto nome){
    adAeroportos.add(nome);
}

Aeroporto buscaVooPorNumeroCOmpahia(String sNomeAeroporto){
    for (int i = 0; i < adAeroportos.size(); i++) {
        if(adAeroportos.get(i).sNomeAeroporto.equals(sNomeAeroporto)){
            return adAeroportos.get(i);
        }			
    }
    return null;
}



}
