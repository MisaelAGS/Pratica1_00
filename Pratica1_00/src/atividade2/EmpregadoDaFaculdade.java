package atividade2;

class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    // Construtor
    public EmpregadoDaFaculdade() {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos() {
        return this.salario + (this.horasAula * 40); // Adiciona o bônus de R$ 40 por hora/aula
    }

    String getInfo() {
        return "nome: " + this.nome + " com salário: R$" + (this.salario + (this.horasAula * 40));
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
}
