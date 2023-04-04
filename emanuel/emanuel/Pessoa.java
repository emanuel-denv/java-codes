package emanuel;
import java.util.Scanner;
class Pessoa {
    public static void main(String[] args) {
        String nome;
        int idade;
        int maior_idade = -999;
        String nome_velha = "random";
        String nome_novo = "random2";
        int menor_idade = 999999;
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i<3; i++){
        System.out.println("Digite o nome: ");
        nome = teclado.next();
        System.out.println("Digite a idade");
        idade = teclado.nextInt();
        if(idade >= maior_idade) {
            maior_idade = idade;
            nome_velha = nome;
        } if(idade <= menor_idade) {
            menor_idade = idade;
            nome_novo = nome;
        }
        }
        System.out.printf("O nome da pessoa mais velha é %s e a sua idade é %d\n", nome_velha, maior_idade);
        System.out.printf("O nome da pessoa mais nova é %s e a sua idade é %d\n", nome_novo, menor_idade);
        teclado.close();
    }
}
