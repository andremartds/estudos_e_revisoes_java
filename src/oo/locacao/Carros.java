package oo.locacao;

public class Carros
{
    private String placa, modelo, cor, categoria;
    private int ano;
    public Carros(String placa, String modelo, String cor, int ano, String categoria)
    {
        this.placa=placa;
        this.modelo=modelo;
        this.cor=cor;
        this.ano=ano;
        this.categoria=categoria;
    }
    public Carros(String placa, String modelo, String cor, int ano)
    {
        this(placa, modelo, cor, ano, "Básico");
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public String getmodelo(){
        return this.modelo=modelo;
    }
    public void setmodelo(String modelo){
        this.modelo=modelo;
    }
    public String getcor(){
        return this.cor;
    }
    public void setcor(String cor){
       this.cor=cor;
    }
    public int getano(){
        return this.ano;
    }
    public void setano(int ano){
        this.ano=ano;
    }
    public String getcategoria(){
        return this.categoria;
    }
    public void setcategoria(String categoria){
        this.categoria=categoria;
    }
}