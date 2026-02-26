import java.util.*;
public class Main{
    final static Scanner LER=new Scanner(System.in);
    final static Random SORTEIO=new Random();

    // 1) Escreva um programa que receba uma matriz A(5,5) e retorne a soma dos seus elementos.
    public static void exercicio1(int[][] matriz) {
        if(matriz.length!=5&&matriz[0].length!=5){
            System.out.println("matriz inválida");
            return;
        }
        int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma+=matriz[i][j];
            }
        }
        System.out.println(soma);
    }

    // 2) Escreva um programa que receba uma matriz A(6,6) e retorne a soma dos elementos da sua diagonal principal.
    public static void exercicio2(int[][] matriz) {
        if(matriz.length!=6&&matriz[0].length!=6){
            System.out.println("matriz inválida");
            return;
        }
        int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i==j){
                    soma+=matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }

    // 3) Escreva um programa que receba uma matriz A(6,6) e retorne a soma dos elementos da sua diagonal secundária.
    public static void exercicio3(int[][] matriz) {
        if(matriz.length!=6&&matriz[0].length!=6){
            System.out.println("matriz inválida");
            return;
        }
        int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i+j==matriz.length-1){
                    soma+=matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }

    // 4) Escreva um programa que receba uma matriz A(7,6) e retorne a soma dos elementos da linha 5 e da coluna 3.
    public static void exercicio4(int[][] matriz) {
        if(matriz.length!=7&&matriz[0].length!=6){
            System.out.println("matriz inválida");
            return;
        }
        int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i==5||j==3){
                    soma+=matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }

    // 5) Escreva um programa que receba uma matriz A(6,6) e retorne o menor elemento da sua diagonal secundária.
    public static void exercicio5(int[][] matriz) {
        if(matriz.length!=6&&matriz[0].length!=6){
            System.out.println("matriz inválida");
            return;
        }
        int soma=0;
        int menor=999999999;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length; j >= 0; j--) {
                if(i+j==matriz.length-1 && matriz[i][j]<menor){
                    soma+=matriz[i][j];
                    menor=matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }

    /* 6) Escreva um programa que receba uma matriz A(8,8) e calcule 
     o maior elemento da sua diagonal principal.
     A seguir, o algoritmo deve dividir todos os elementos de A 
     pelo maior encontrado e armazenando em uma matriz B(8,8).
    */
    public static void exercicio6(int[][] matrizA) {
        if(matrizA.length!=8&&matrizA[0].length!=8){
            System.out.println("matriz inválida");
            return;
        }
        int maior=-999999999;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                if(i==j && matrizA[i][j]>maior){
                    maior=matrizA[i][j];
                }
            }
        }
        float[][] matrizB = new float[8][8];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizB[i][j]=matrizA[i][j]/maior;
                System.out.printf("%.2f ",matrizB[i][j]);
                // ou System.out.printf("%2.f ", matrizA[i][j]/maior)
            }
            System.out.println();
        }
    }

    // 8) Escreva um programa que receba uma matriz M(6,6) e um valor A . O procedimento
    // deve multiplicar cada elemento de M por A e armazenar em um vetor V(36).
    public static void exercicio8(int[][] matriz, int a) {
        if(matriz.length!=6&&matriz[0].length!=6){
            System.out.println("matriz inválida");
            return;
        }
        int[] vetor=new int[36];
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vetor[cont]=matriz[i][j]*a;
                System.out.printf("%d ",vetor[cont]);
                cont++;
            }
        }
    }

    /*  9) Escreva um programa que receba uma matriz A(10,10), e realize as seguintes trocas:
    a) a linha 2 com a linha 8;
    b) a coluna 4 com a coluna 10;
    c) a diagonal principal com a secundária;
    d) a linha 5 com a coluna 10;
    Ao final, apresente a Matriz A atualizada
    */
    public static void exercicio9(int[][] matriz) {
        if(matriz.length!=10&&matriz[0].length!=10){
            System.out.println("matriz inválida");
            return;
        }
        int troca;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i==2){
                    troca=matriz[8][j];
                    matriz[8][j]=matriz[i][j];
                    matriz[i][j]=troca;
                }
                if(j==4){
                    troca=matriz[i][10];
                    matriz[i][10]=matriz[i][j];
                    matriz[i][j]=troca;
                }
                if(i+j==matriz.length -1){
                    troca=matriz[i][i];
                    matriz[i][i]=matriz[i][j];
                    matriz[i][j]=troca;
                }
            }
            troca=matriz[5][i];
            matriz[5][i]=matriz[i][10];
            matriz[i][10]=troca;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%d ",matriz[i][j]);
            }
        }
    }

    // 10) Escreva um programa que receba uma matriz B(9,9) de inteiros e retorne a soma dos elementos das linhas pares de B.
    public static void exercicio10(int[][] matriz) {
        if(matriz.length!=9&&matriz[0].length!=9){
            System.out.println("matriz inválida");
            return;
        }
        int soma=0;
        for (int i = 0; i < matriz.length; i+=2) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma+=matriz[i][j];
            }
        }
        System.out.printf(" %d \n",soma);
    }

    // 11) Escreva um programa que receba uma matriz A(6,6) e multiplique cada linha pelo elemento da 
    // diagonal principal daquela linha. O procedimento deve retornar a matriz alterada.
    public static void exercicio11(int[][] matriz) {
        if(matriz.length!=6&&matriz[0].length!=6){
            System.out.println("matriz inválida");
            return;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]*=matriz[i][i];
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println();
        }
    }

    // 12) Escreva um programa que receba uma matriz A(12,12) e retorne a média aritmética dos elementos abaixo da diagonal principal.
    public static void exercicio12(int[][] matriz) {
        if(matriz.length!=12&&matriz[0].length!=12){
            System.out.println("matriz inválida");
            return;
        }
        int soma=0;
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i>j){
                    soma+=matriz[i][j];
                    cont++;
                }
                System.out.printf("%.2f ",soma/cont);
            }
            System.out.println();
        }
    }

    // 13) Escreva um programa que receba uma matriz A(10,10) e retorne a soma dos elementos acima da diagonal principal.
    public static void exercicio13(int[][] matriz) {
        if(matriz.length!=10&&matriz[0].length!=10){
            System.out.println("matriz inválida");
            return;
        }
        int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i<j){
                    soma+=matriz[i][j];
                }
                System.out.printf("%d ",soma);
            }
            System.out.println();
        }
    }

    // Elaborar um programa em java usando métodos para determinar a matriz A = [aij]n x m tal que se i+j for par 
    public static void exercicioOda1(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=2*i + (int) Math.pow(j,2);
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Elaborar um programa em java usando métodos para determinar a matriz A = [aij]n x m tal que aij = 2i + j2
    public static void exercicioOda2(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i+j%2==0){
                    matriz[i][j]= (int)Math.pow(-i,2);
                }else{
                    matriz[i][j]= 2*i*j;
                }
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.printf("\n\tDigite um número para a linha e para a coluna respectivamente\n");
        int tamanhoLinha=LER.nextInt();
        int tamanhoColuna=LER.nextInt();
        int[][] matrizUsuario = new int[tamanhoLinha][tamanhoColuna];
        System.out.println("\tdigite 14 ou 15 se quiser os exercicios do Oda");
        int escolha=LER.nextInt();
        switch (escolha) {
            case 14:
                exercicioOda1(matrizUsuario);
                break;

            case 15:
                exercicioOda2(matrizUsuario);
                break;
        default:
            break;
        }
        for (int i = 0; i < matrizUsuario.length; i++) {
            for (int j = 0; j < matrizUsuario[0].length; j++) {
                System.out.printf("\nagora digite o valor da matriz[%d][%d]\n",i,j);
                int aleatorio=SORTEIO.nextInt(20);
                matrizUsuario[i][j]=aleatorio;
                System.out.printf("%d ",matrizUsuario[i][j]);
            }
            System.out.println();
        }
        System.out.printf("\tDigite um número para escolher o exercicio\n");

        escolha=LER.nextInt();
        switch (escolha) {
            case 1:
                exercicio1(matrizUsuario);
                break;

            case 2:
                exercicio2(matrizUsuario);
                break;

            case 3:
                exercicio3(matrizUsuario);
                break;

            case 4:
                exercicio4(matrizUsuario);
                break;

            case 5:
                exercicio5(matrizUsuario);
                break;

            case 6:
                exercicio6(matrizUsuario);
                break;

            case 8:
                System.out.println("\ndigite o multiplicador");
                int valor=LER.nextInt();
                exercicio8(matrizUsuario, valor);
                break;

            case 9:
                exercicio9(matrizUsuario);
                break;

            case 10:
                exercicio10(matrizUsuario);
                break;

            case 11:
                exercicio11(matrizUsuario);
                break;

            case 12:
                exercicio12(matrizUsuario);
                break;

            case 13:
                exercicio13(matrizUsuario);
                break;
        
            default:
                break;
        }

    }

}
