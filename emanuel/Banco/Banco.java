package emanuel;
import java.util.ArrayList;

public class Banco {

	private String nome;
	private ArrayList<Conta> contas;
	
	public Banco(String nome) {
		this.nome=nome;
		contas = new ArrayList<Conta>();
	}
	
	public boolean adicionar(Conta c) {
		if (contas.contains(c))
			return false;
		else
			contas.add(c);
		return true;
	}
	
	public boolean adicionar(String tit, int num , double saldo) {
		Conta c;  //new Conta (tit, num, saldo);
		
		c = procurar(num);
		if (c!=null)
			return false;
		else 
			contas.add(new Conta(tit, num, saldo));
		return true;
	}
	
	public Conta procurar(int numero) {
		for (int i=0; i<contas.size(); i++) {
			if (contas.get(i).getNumero()==numero)
				return contas.get(i);
		}
		return null;
	}
	
	public void mostrarDados() {
		//for (int i=0; i<contas.size(); i++) {
		for (Conta c: contas){
			System.out.println(c.toString());
		}
	}
	
	public void remover(Conta c) {
		contas.remove(c);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
