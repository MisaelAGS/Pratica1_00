package atividade3;


class Aluno {
    private String nome;
    private String matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;

    // Construtor
    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    // Métodos para alterar notas
    public void alteraNotaAV1(double novaNota) {
        this.notaAV1 = novaNota;
    }

    public void alteraNotaAV2(double novaNota) {
        this.notaAV2 = novaNota;
    }

    public void alteraNotaAE(double novaNota) {
        this.notaAE = novaNota;
    }

    // Método para avaliar o aluno
    public void avaliarAluno() {
        double somaNotas = notaAV1 + notaAV2;
        if (somaNotas >= 60) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Recuperação");
        }
    }

    // Método para avaliar a recuperação
    public void avaliarRecuperacao(double notaAE) {
        double media = (notaAV1 + notaAV2 + notaAE) / 3;
        if (media >= 60) {
            System.out.println("Situação na recuperação: Aprovado");
        } else {
            System.out.println("Situação na recuperação: Reprovado");
        }
    }
}