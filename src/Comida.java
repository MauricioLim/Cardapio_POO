public class Comida implements itemCardapio{
    private int pessoas;
    private String prato;
    private double preco;
    
    public Comida(String nome, int qtdPessoas, double valor){
        setNome(nome);
        setPreco(valor);
        setPessoas(qtdPessoas);
    }

    private void setNome(String nome){
        this.prato = nome;
    }

    public String getNome(){
        return this.prato;
    }

    public void setPreco(double valor){
        this.preco = valor;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPessoas(int qtd){
        this.pessoas = qtd;
    }

    public double getPessoas(){
        return this.pessoas;
    }
}
