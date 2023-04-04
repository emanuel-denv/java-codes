package compra;

public class ItemDeCompra {
    String codigo;
    String nomeDoProduto;
    double precoUnit;
    int quantidade;
    double valor;
    public ItemDeCompra(String codigo, String nomeDoProduto, double precoUnit){
        this.codigo = codigo;
        this.nomeDoProduto = nomeDoProduto;
        this.precoUnit = precoUnit;
    }
    public void calcularTotal(int quantidade, double precoUnit) {
        valor = quantidade*precoUnit;
    }
    public double getValor(){
        return valor;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }
    public double getPrecoUnit() {
        return precoUnit;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
}