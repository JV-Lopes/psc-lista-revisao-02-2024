package Lr2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();
        
        if (nota >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
        
        scanner.close();
    }
}
