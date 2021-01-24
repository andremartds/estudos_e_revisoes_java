package oo.locacao;

public class Locacao
{   
    private int diaInicio, mesInicio, diaTermino, mesTermino;
    private Carros carro;
    static int basico=120, luxo=160, spLuxo=210;


    public Locacao(int diaInicio, int mesInicio, int diaTermino, int mesTermino, Carros carro)
    {
        this.diaInicio=diaInicio;
        this.mesInicio=mesInicio;
        this.diaTermino=diaTermino;
        this.mesTermino=mesTermino;
        this.carro=carro;
    }
    public void setdiaInicio(int diaInicio){
        this.diaInicio=diaInicio;
    }
    public int getdiaInicio(){
        return this.diaInicio;
    }
    public void setmesInicio(int mesInicio){
        this.mesInicio=mesInicio;
    }
    public int getmesInicio(){
        return this.mesInicio;
    }
    public void setdiaTermino(int diaTermino){
        this.diaTermino=diaTermino;
    }
    public int getdiaTermino(){
        return this.diaTermino;
    }
    public void setmesTermino(int mesTermino){
        this.mesTermino=mesTermino;
    }
    public int getmesTermino(){
        return this.mesTermino;
    }
    public String getcategoria(){
        return this.carro.getcategoria();
    }
    public int getano(){
        return this.getano();
    }
    public Carros getcarro(){
        return this.carro;
    }
    public void setcarro(Carros novo){
        this.carro=novo;
    }
    public String getmodelo(){
        return this.getmodelo();
    }
    public String getPlaca(){
        return this.getPlaca();
    }
}
