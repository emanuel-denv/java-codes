package emanuel;

public class Aluno {
    String nome;
    int idade;
    int cpf;
    public Aluno(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void mudarnome(String novonome) {
        this.nome = novonome;
    }
    
    void mostrardados() {
        System.out.printf("O nome é %s\n", nome);
        System.out.printf("E a sua idade é %s\n", idade);
    }
}
