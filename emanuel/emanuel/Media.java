package emanuel;
import java.util.Scanner;

class Media {
  static double n1;
  static double n2;
  static double soma;
  static double media;
  public static void fazer_media(String[] args) {
    System.out.println("Digite um número: ");
    Scanner teclado = new Scanner (System.in);
    n1 = teclado.nextFloat();
    System.out.println("Digite outro número: ");
    n2 = teclado.nextFloat();
    soma = n1+n2;
    media = soma/2;
    System.out.printf("A soma dos dois números foi %f\n", soma);
    System.out.printf("A média foi %f\n", (n1+n2)/2);
    teclado.close();
    if(media>7){
      System.out.println("Aprovado media "+media);
    } else if(media>4 && media<7){
      System.out.println("AF");
    } else {
      System.out.println("Reprovado direto "+media);
    }
  }
}