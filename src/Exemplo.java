package src;

import java.util.Scanner;

// for - para
// é utilizado quando sabemos a quantidade de vezes que queremos executar
// para (inicialização; condição; incremento) {
//   bloco de códigos
// }

// while - enquanto
// enquanto a condição for verdadeira, o bloco de códigos é executado
// tem a possibilidade de nunca acontecer
// enquanto (condição) {
//   bloco de códigos
// }

// do ... while - faça ... enquanto
// enquanto a condição for verdadeira, o bloco de códigos é executado
// sempre acontece, pelo menos, uma vez
// faca {
//   bloco de códigos
// } enquanto (condição);

public class Exemplo {
  // Programa para cadastrar os visitantes de um evento
  // Serão 5 visitantes, e deve-se armazenar seus nomes e emails em uma estrutra de matriz
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[][] visitantes = new String[2][5];
    
    for (int i = 0; i < 5; i++) {
      System.out.println("Insira o nome do 1o visitante: ");
      visitantes[0][i] = scan.next();
      System.out.println("Insira o email do 1o visitante: ");
      visitantes[1][i] = scan.next();
      System.out.println(visitantes[0][i] + " seja bem vindo!");
    }

    for (int i = 0; i < 5; i++) { // visitantes
      for (int j = 0; j < 2; j++) { // informações dos visitantes
        System.out.println(visitantes[j][i]);
      }
    }

    System.out.println("E acabou!");
    scan.close();
  }
}
