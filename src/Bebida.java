public class Bebida implements itemCardapio {
    private String nome;
    private int quantidade;
    private double preco;


    public Bebida(String desc, int ml, double valor){
        setNome(desc);
        setPreco(valor);
        setQuantidade(ml);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String desc){
        this.nome = desc;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int qdd){
        this.quantidade = qdd;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double valor){
        this.preco = valor;
    }
}
