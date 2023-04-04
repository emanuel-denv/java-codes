package compra;
 
public class Main
{
    public static void main(String[] args) {
        ItemDeCompra ipad = new ItemDeCompra("123123", "Arroz", 4.50);
		ipad.getCodigo();
        ipad.calcularTotal(5, 2.5);
        System.out.println("Olhos castanhos");
    }
}
