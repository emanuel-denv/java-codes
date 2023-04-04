package emanuel;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas", 27); 
        Aluno aluno2 = new Aluno("Raul", 28);
        Banco banco1 = new Banco("Itau");
        Conta c1 = new Conta("Rafael", 1932355);
        aluno1.mudarnome("Kurapika");
        aluno2.mudarnome("Gon");
        aluno1.mostrardados();
        aluno2.mostrardados();
        banco1.adicionar(c1);
        banco1.mostrarDados();
    }

}