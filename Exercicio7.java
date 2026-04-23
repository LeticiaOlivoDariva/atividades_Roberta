import java.util.*;
//7) Escreva um programa que receba duas matrizes A(4,6) e B(6,4) e retorne uma matriz C, que
//seja o produto matricial de M por N.

public class Exercicio7{
    final static Scanner LER=new Scanner(System.in);
    final static Random SORTEIO=new Random();

    public static int[][] arrumaMatriz(){
        System.out.printf("\n\tDigite um número para a linha e para a coluna respectivamente\n");
        int tamanhoLinha=LER.nextInt();
        int tamanhoColuna=LER.nextInt();
        int[][] matrizUsuario = new int[tamanhoLinha][tamanhoColuna];

        for (int i = 0; i < matrizUsuario.length; i++) {
            for (int j = 0; j < matrizUsuario[0].length; j++) {
                System.out.printf("\nagora digite o valor da matriz[%d][%d]\n",i,j);
                int aleatorio=SORTEIO.nextInt(20);
                matrizUsuario[i][j]=aleatorio;
                System.out.printf("%d ",matrizUsuario[i][j]);
            }
            System.out.println();
        }
        return matrizUsuario;
    }
    
    public static void main(String[] args) {
        int[][] matrizUsuario1=aa();
        int[][] matrizUsuario2=aa();
        if(matrizUsuario1[0].length==matrizUsuario2.length){
            int[][] matrizSistema=new int[matrizUsuario1.length][matrizUsuario2[0].length];
            int cont=0;
            for (int i = 0; i < matrizSistema.length; i++) {
                for (int j = 0; j < matrizSistema[0].length; j++) {
                    matrizSistema[i][j]=matrizUsuario1[i][cont]*matrizUsuario2[cont][j]+matrizUsuario1[i][cont+1]*matrizUsuario2[cont+1][j];
                    System.out.printf(" %d", matrizSistema[i][j]);
                }
                cont++;
                System.out.println();
            }
        }
    }

}
