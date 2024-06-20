package com.javalokura.atividade_vetor_e_matriz;

/**
 *
 * @author Alexander
 */
import java.util.Scanner;
import java.util.Random;
public class Atividade_vetor_e_matriz {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random aleat = new Random();
        
        int numeroAleat = aleat.nextInt(10000) + 1;
        int[] tentativas = new int[11]; 
        int numTentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-Vindo ao jogo, advinhe o numero em ate 10 tentativas");
        System.out.println("Tente advinhar o numero secreto de 1 a 10 MIL.");
        
        while (!acertou){
            System.out.print("Digite sua tentaiva: ");
            int jogada = scan.nextInt();
            tentativas[numTentativas] = jogada;
            numTentativas++;
            
            if (jogada == numeroAleat){
                System.out.println("Parabens, voce advinhou o numero secreto em " + numTentativas + " tentativas");
                acertou = true;
            }
            else if(numTentativas == 10){
                System.out.println("Voce PERDEU, numeros de tentativas atingidos, tente novamente.");
                System.out.println("O numero aleatorio era: " + numeroAleat);
                acertou = true;
            }
            else if (jogada < numeroAleat){
                System.out.println("O numero secreto e maior que " + jogada + ".");                
            }
            else if(jogada > numeroAleat) {
                System.out.println("O numero secreto e menor que " + jogada + ".");
            }
            
           
        }
         
        for(int i = 0; i < numTentativas; i++){
            System.out.println("Sua jogada do indice " + i + " foi: " + tentativas[i]);
        }
        
        
     scan.close();
     
     
     int semanas = 5;
        int diaSemanas = 7;
        
        int[][] calendario = new int[semanas][diaSemanas];
        
        int dia = 1;
        boolean mesIniciado = false;
        
        for (int i = 0; i < semanas; i++){
            for (int j = 0; j < diaSemanas; j++){
                if (i == 0 && j < 5){
                    calendario[i][j] = 0;
                }
                else if (dia <= 30){
                    calendario[i][j] = dia++;
                } else {
                    calendario[i][j] = 0;
                }               
            }                      
        }
        
        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};
        System.out.println("Calendario de Junho 2024:");
        for (String diaDSemana : diasDaSemana){
            System.out.print
        (diaDSemana + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < semanas; i++){
            for (int j = 0; j < diaSemanas; j++){
                if (calendario[i][j] == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print(calendario[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
