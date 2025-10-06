public class Comida implements itemCardapio{
    private String nome;
    private int quantidade;
    private double preco;
    
    public Comida(String nome, int qtdPessoas, double valor){
        setNome(nome);
        setPreco(valor);
        setQuantidade(qtdPessoas);
    }

    private void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double valor){
        this.preco = valor;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setQuantidade(int qtd){
        this.quantidade = qtd;
    }

    public double getQuantidade(){
        return this.quantidade;
    }
}
