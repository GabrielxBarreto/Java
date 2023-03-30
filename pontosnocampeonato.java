
 import java.util.Scanner;
 

 public class pontosnocampeonato {
 
     public static void main(String[] args) {
         
        int op;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nSELECIONE A AÇÃO:\n1-CADASTRAR RESULTADOS\n2-SAIR");
            op = scanner.nextInt();
            System.out.println("QUANTAS PARTIDAS FORAM JOGADAS ESTE ANO:");
            int partidas = scanner.nextInt();
            char[] resultado = new char[partidas];
            int pontuacao = 0;
            for (int i = 0; i < partidas; i++) {
                System.out.printf("QUAL FOI A CLASSIFICAÇÃO DO TIME NO JOGO: [%d]\n", i + 1);
                char classificacao = scanner.next().charAt(0);
                resultado[i] = classificacao;
                if (resultado[i] == 'V' || resultado[i] == 'v') {
                    pontuacao += 3;
                } else if (resultado[i] == 'E' || resultado[i] == 'e') {
                    pontuacao += 1;
                }

            }
            System.out.println("----------------[RESULTADO]---------------------\n");
            for (char n : resultado) {
                System.out.println(n);
            }
            System.out.println("-------------------------------------------------\n");
            System.out.printf("PONTOS NO TOTAL: [ %d ]", pontuacao);
        }while(op!=2);
    }
 }
 