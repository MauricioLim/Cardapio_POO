public class Bebida implements itemCardapio {
    private String nome;
    private int qtd;
    private double preco;


    public Bebida(String desc, int ml, double valor){
        setNome(desc);
        setPreco(valor);
        setQtd(ml);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String desc){
        this.nome = desc;
    }

    public int getQtd(){
        return this.qtd;
    }

    public void setQtd(int qdd){
        this.qtd = qdd;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double valor){
        this.preco = valor;
    }
}
