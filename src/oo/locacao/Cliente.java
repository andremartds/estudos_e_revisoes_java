package oo.locacao;

public class Cliente
{
    private int cpf, tel;
    private String nome,email;
    private Locacao[]locacao;
    public Cliente(int cpf, String nome, int tel, String email)
    {
        this.cpf=cpf;
        this.nome=nome;
        this.tel=tel;
        this.email=email;
        this.locacao=new Locacao[5];
    }

    public void setcpf(int cpf){
        this.cpf=cpf;
    }

    public int getcpf(){
        return this.cpf;
    }

    public void setnome(String nome){
        this.nome=nome;
    }

    public String getnome(){
        return this.nome;
    }

    public void settel(int tel){
        this.tel=tel;
    }

    public int gettel(){
        return this.tel;
    }
    public void setemail(String email){
        this.email=email;
    }
    public String getemail(){
        return this.email;
    }
    public float location(Locacao nova){
        float valor=0;
        int periodo=0;
        for (int i=0;i<locacao.length;i++){
            if(locacao[i]==null){
            locacao[i]=nova;
            periodo=(nova.getdiaTermino()-nova.getdiaInicio())+((nova.getmesTermino()*30)-(nova.getmesInicio()*30));
                if (nova.getcategoria().equals("Básico")){
                    valor=periodo*Locacao.basico;
                    break;
                }
                if(nova.getcategoria().equals("Luxo")){
                    valor=periodo*Locacao.luxo;
                    break;
                }
                if(nova.getcategoria().equals("Super luxo")){
                    valor=periodo*Locacao.spLuxo;
                    break;
                }    
            }
        }
        return valor;
    }
    public void checkSubst(Carros novo){
        for (int i=0; i<locacao.length;i++)
            if(locacao[i]!=null)
                if((locacao[i].getcategoria().equals(novo.getcategoria()))&&(novo.getano()<=locacao[i].getano())){
                    locacao[i].setcarro(novo);
                    break;
                }
    }
    public float checkCost(){
        float valor=0;
        int periodo=0;
        for(int i=0; i<locacao.length;i++)
            if(locacao[i]!=null){
              periodo=(locacao[i].getdiaTermino()-locacao[i].getdiaInicio())+((locacao[i].getmesTermino()*30)-(locacao[i].getmesInicio()*30));
                if(locacao[i].getcategoria().equals("Básico"))
                    valor=periodo*Locacao.basico;

                if(locacao[i].getcategoria().equals("Luxo"))
                    valor=periodo*Locacao.luxo;

                if(locacao[i].getcategoria().equals("Super luxo"))
                    valor=periodo*Locacao.spLuxo;
              break;
            }
        return valor;
    }
    public float checkTotalCost(){
        float valor=0;
        int periodo=0;
        for(int i=0; i<locacao.length;i++)
            if(locacao[i]!=null){
                if(locacao[i].getcategoria().equals("Básico")){
                    periodo=((locacao[i].getdiaTermino()-locacao[i].getdiaInicio())+((locacao[i].getmesTermino()*30)-(locacao[i].getmesInicio()*30)));
                    valor+=periodo*Locacao.basico;
                }
                if(locacao[i].getcategoria().equals("Luxo")){
                    periodo=((locacao[i].getdiaTermino()-locacao[i].getdiaInicio())+((locacao[i].getmesTermino()*30)-(locacao[i].getmesInicio()*30)));
                    valor+=periodo*Locacao.luxo;
                }
                if(locacao[i].getcategoria().equals("Super luxo")){
                    periodo=((locacao[i].getdiaTermino()-locacao[i].getdiaInicio())+((locacao[i].getmesTermino()*30)-(locacao[i].getmesInicio()*30)));
                    valor+=periodo*Locacao.spLuxo;
                }
            }
        return valor;
    }
    public int checkCar(String categoria){
        int qtd=0;
        for(int i=0;i<locacao.length;i++)
            if(locacao[i]!=null)
                if(locacao[i].getcategoria().equals(categoria))
                qtd++;
        return qtd;
    }
    public void imprimir(){
     System.out.println("Nome:"+nome);
     System.out.println("Cpf:"+cpf);
     System.out.println("Telefone:"+tel);
     System.out.println("Email:"+email);
     for(int i=0;i<locacao.length;i++)
        if(locacao[i]!=null){
            System.out.println("Dia de início:"+locacao[i].getdiaInicio()+"Mês de inicio:"+locacao[i].getmesInicio());
            System.out.println("Dia de término:"+locacao[i].getdiaTermino()+"Mês de término:"+locacao[i].getmesTermino());
            System.out.println("Modelo do carro:"+locacao[i].getmodelo());
            System.out.println("Placa do carro:"+locacao[i].getPlaca());
            System.out.println("Valor da locação:"+checkCost());
        }
    }
}