package atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a nota da AV1: ");
        double notaAV1 = scanner.nextDouble();

        System.out.print("Digite a nota da AV2: ");
        double notaAV2 = scanner.nextDouble();

        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite o período do aluno: ");
        int periodo = scanner.nextInt();

        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        aluno.avaliarAluno();

        System.out.print("Digite a nota da AE: ");
        double notaAE = scanner.nextDouble();

        aluno.avaliarRecuperacao(notaAE);

        scanner.close();
    }
}
